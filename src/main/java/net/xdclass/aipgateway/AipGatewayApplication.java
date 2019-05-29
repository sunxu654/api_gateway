package net.xdclass.aipgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AipGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AipGatewayApplication.class, args);
    }

}
