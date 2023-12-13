package doip.custom.simulation;

import doip.library.message.UdsMessage;
import doip.simulation.EcuConfig;
import doip.simulation.standard.StandardEcu;

public class CustomEcu extends StandardEcu {

	public CustomEcu(EcuConfig config) {
		super(config);
	}

	@Override
	public boolean processRequestBeforeLookupTable(UdsMessage udsRequest) {
		// Here you can add some special handling for a UDS message
		// before the message will be handled by searching patterns
		// in the lookup table.
		
		// Return false means that message was not handled in this 
		// function and that processing message shall be
		// continued by further functions (lookup table, normal message interpretation)
		
		return false;
	}

	@Override
	public boolean processRequestAfterLookupTable(UdsMessage request) {
		// If a message was not handled by the lookup table then message 
		// processing will be handled within this function. 
		
		// Default handling will be to send negative response with NRC 0x10
		return super.processRequestAfterLookupTable(request);
	}
}
