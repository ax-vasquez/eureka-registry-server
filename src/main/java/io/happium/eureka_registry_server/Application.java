package io.happium.eureka_registry_server;

import io.happium.eureka_registry_server.configuration.EurekaServerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({EurekaServerConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run( Application.class, args );
    }

}
