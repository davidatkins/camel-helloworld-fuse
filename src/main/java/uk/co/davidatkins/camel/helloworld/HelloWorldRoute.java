package uk.co.davidatkins.camel.helloworld;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://hello?fixedRate=true&period=5000").log("Hello World!");
	}

}
