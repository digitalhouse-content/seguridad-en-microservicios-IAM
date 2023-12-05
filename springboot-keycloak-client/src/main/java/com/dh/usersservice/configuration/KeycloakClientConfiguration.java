package com.dh.usersservice.configuration;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "keycloak")
public class KeycloakClientConfiguration {
  @Value("${dh.keycloak.realm}")
  private String realm;
  @Value("${dh.keycloak.serverurl}")
  private String serverurl;
  @Value("${dh.keycloak.clientid}")
  private String clientid;
  @Value("${dh.keycloak.clientsecret}")
  private String clientsecret;

  @Bean
  public Keycloak getInstance() {
    return KeycloakBuilder.builder()
        .serverUrl(serverurl)
        .realm(realm)
        .clientId(clientid)
        .clientSecret(clientsecret)
        .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
        .build();
  }

}
