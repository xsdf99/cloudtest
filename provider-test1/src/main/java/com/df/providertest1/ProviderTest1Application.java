package com.df.providertest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ProviderTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTest1Application.class, args);
    }

}
