package doip.custom.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import doip.library.properties.EmptyPropertyValue;
import doip.library.properties.MissingProperty;
import doip.simulation.nodes.GatewayConfig;

public class Main {

	public static void main(String[] args) throws IOException, MissingProperty, EmptyPropertyValue {
		if (args.length != 1) {
			System.out.println("Invalid number of arguments.");
			System.out.println("Usage:");
			System.out.println("    ./start.sh <property-file>");
			System.out.println("Example:");
			System.out.println("    ./start.sh gateway.properties");
			System.exit(1);
		}
		System.out.println("Starting DoIP simulation ...");

		GatewayConfig config = new GatewayConfig();

		config.loadFromFile(args[0]);

		CustomGateway gateway = new CustomGateway(config);
		gateway.start();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press <Enter> to terminate simulation");
		reader.readLine();

		gateway.stop();
		System.out.println("... DoIP simulation finished.");
	}
}
