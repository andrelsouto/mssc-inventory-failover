package br.com.andre.msscinventoryfailover.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableEurekaClient
@Profile("local-discovery")
@Configuration
public class LocalDiscovery {
}
