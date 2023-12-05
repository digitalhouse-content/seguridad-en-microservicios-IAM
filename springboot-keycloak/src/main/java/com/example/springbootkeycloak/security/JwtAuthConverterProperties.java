package com.example.springbootkeycloak.security;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter")
public class JwtAuthConverterProperties {

    private String resourceId;
	private String principalAttribute;
	
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getPrincipalAttribute() {
		return principalAttribute;
	}
	public void setPrincipalAttribute(String principalAttribute) {
		this.principalAttribute = principalAttribute;
	}
}
