package com.example.switchyard.bar;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://Camel").to("switchyard://Baz").to("switchyard://TwoBazBean")
				.log("Received message for 'Camel' : ${body}");
	}

}
