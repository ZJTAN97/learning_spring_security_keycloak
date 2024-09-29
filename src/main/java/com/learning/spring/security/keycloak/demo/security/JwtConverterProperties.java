package com.learning.spring.security.keycloak.demo.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;


/**
 * The JwtConverterPropertiesclass is a configuration class for JWT authentication conversion.
 * It holds properties like “resourceId” (Keycloak resource identifier) and “principalAttribute” (preferred principal attribute).
 * These properties play a crucial role in decoding and processing JWTs within the Keycloak integration.
 */
@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter")
public class JwtConverterProperties {
    private String resourceId;
    private String principalAttribute;
}
