package com.dh.usersservice;

import com.dh.usersservice.configuration.KeycloakClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan("com.dh.usersservice")
public class UsersServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(UsersServiceApplication.class, args);
  }

}
