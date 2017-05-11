package client.configuration;

import client.UNSPSCClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UNSPSCConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("client.wsdl");
		return marshaller;
	}

	@Bean
	public UNSPSCClient quoteClient(Jaxb2Marshaller marshaller) {
		UNSPSCClient client = new UNSPSCClient();
		client.setDefaultUri("http://www.webservicex.net/GenericUNSPSC.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}