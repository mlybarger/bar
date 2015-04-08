package com.example.switchyard.bar;

import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://CamelRouteTest").log(
				"Received message for ${body.path} 'CamelRouteTest' : ${body}");
	}

}
