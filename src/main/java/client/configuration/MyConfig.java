package client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

/**
 * Created by pedro on 10/05/17.
 */
public class MyConfig {

    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
}
