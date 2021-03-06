package com.hazelcast.samples.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Run with "{@code java -jar eureka-server-0.1-SNAPSHOT.jar}"
 * <p>
 * The annotation {@code @EnableEurekaServer} does all the work, turning this
 * process into a Eureka server.
 * <p>
 * Eureka server will be available from
 * <a href="http://localhost:8761/">http://localhost:8761/</a>
 * <p>
 * Eureka server should really be clustered.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    private static final String CLUSTER_NAME = "HAZELCAST";

    static {
        System.setProperty("spring.application.name", CLUSTER_NAME);
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
