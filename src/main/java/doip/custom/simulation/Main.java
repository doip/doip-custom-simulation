package doip.custom.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import doip.library.properties.EmptyPropertyValue;
import doip.library.properties.MissingProperty;
import doip.simulation.nodes.GatewayConfig;

public class Main {

	public static void main(String[] args) throws IOException, MissingProperty, EmptyPropertyValue {
		
		boolean interactive = false;
		LinkedList<String> propertyFiles = new LinkedList<String>();
		
		for (int i = 0; i < args.length; i++) {
			if ("-i".equals(args[i]) || "--interactive".equals(args[i])) {
				interactive = true;
			} else {
				propertyFiles.add(args[i]);
			}
		}
		
		if (propertyFiles.size() == 0) {
			System.out.println("No argument for property file was given.");
			System.exit(1);
		}


		int numberOfGateways = propertyFiles.size();
		GatewayConfig configs[] = new GatewayConfig[numberOfGateways];
		CustomGateway gateways[] = new CustomGateway[numberOfGateways];
		
		int i = 0;
		for (String propertyFile : propertyFiles) {
			configs[i] = new GatewayConfig();
			System.out.println("Load gateway configuration \"" + propertyFile + "\"");
			configs[i].loadFromFile(propertyFile);
			i++;
		}
		
		for (i = 0; i<numberOfGateways; i++) {
			gateways[i] = new CustomGateway(configs[i]);
		}
		
		System.out.println("Starting DoIP simulation ...");
		for (i = 0; i<numberOfGateways; i++) {
			gateways[i].start();
		}

		if (interactive) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Press <Enter> to terminate simulation");
			reader.readLine();
		} else {
			for(;;) {
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
				}
			}
		}

		for (i = 0; i < numberOfGateways; i++) {
			gateways[i].stop();
		}
		System.out.println("... DoIP simulation finished.");
	}
}
