package doip.custom.simulation;

import doip.simulation.nodes.EcuConfig;
import doip.simulation.nodes.GatewayConfig;
import doip.simulation.standard.StandardEcu;
import doip.simulation.standard.StandardGateway;

public class CustomGateway extends StandardGateway {

	public CustomGateway(GatewayConfig config) {
		super(config);
	}

	@Override
	public StandardEcu createEcu(EcuConfig config) {
		return new CustomEcu(config);
	}

}
