package com.dh.supplierdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.dh.supplierdataservice.configuration.KeycloakClientConfiguration;

@SpringBootApplication
@ConfigurationPropertiesScan("com.dh.usersservice")
public class SupplierServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SupplierServiceApplication.class, args);
  }

}
