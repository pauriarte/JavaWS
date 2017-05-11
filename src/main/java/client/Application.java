package client;

import client.wsdl.GetUNSPSCSegmentsResponse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class);
	}

/*	@Bean
	CommandLineRunner lookup(UNSPSCClient client) {
		return args -> {
			GetUNSPSCSegmentsResponse response = client.getGetUNSPSCSegments();
			int records = response.getUNSPSCSegmentData().getRecords();
			System.err.println("Records: "+records);

			for (int i = 0; i < records;++i){
				System.err.println("Segment Title: "+response.getUNSPSCSegmentData().getUNSPSCSegmenData().getUNSPSCSegment().get(i).getSegmentTitle());
				System.err.println("Segment: "+response.getUNSPSCSegmentData().getUNSPSCSegmenData().getUNSPSCSegment().get(i).getSegment());
			}
		};
	}*/

}