package com.dh.supplierdataservice.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.dh.supplierdataservice.model.SupplierDTO;

@Repository
public class KeyCloakRepository implements ISupplierRepository{
  @Autowired
  private Keycloak keycloak;
  
  @Value("${dh.keycloak.realm}")
  private String realm;

  @Override
  public Optional<SupplierDTO> findById(String id) {
    UserRepresentation userRepresentation = keycloak
        .realm(realm)
        .users()
        .get(id)
        .toRepresentation();
    return Optional.of(fromRepresentation(userRepresentation));
  }
  
  @Override
  public List<SupplierDTO> findByUsername(String username) {
    List<UserRepresentation> userRepresentation = keycloak
	        .realm(realm)
	        	.groups().group(keycloak.realm(realm)
	        			.getGroupByPath("conflictivo").getId()
	         )
        .members();
  
    return userRepresentation.stream().map(user -> user.getUsername().equals(username)? fromRepresentation(user): null).filter(e -> e!=null).collect(Collectors.toList());
  }


  private SupplierDTO fromRepresentation(UserRepresentation userRepresentation) {
    return new SupplierDTO(userRepresentation.getId(),userRepresentation.getFirstName(),userRepresentation.getLastName(),userRepresentation.getEmail());}


}
