/**
 *
 */
package com.green.mx.keycloak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class KeycloakSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http,
			JwtAuthenticationConverter jwtAuthenticationConverter) throws Exception {

		http.csrf(csrf -> csrf.disable()).cors(cors -> {
		}).authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.requestMatchers("/warehouse/**","/special/**").authenticated().anyRequest().permitAll()
				).oauth2ResourceServer(
						oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter) // 🔥
																												// AQUÍ
						));

		return http.build();
	}

	@Bean
	public JwtAuthenticationConverter jwtAuthenticationConverter() {
		JwtAuthenticationConverter converter = new JwtAuthenticationConverter();

		converter.setJwtGrantedAuthoritiesConverter(jwt -> {
			Collection<GrantedAuthority> authorities = new ArrayList<>();

			Map<String, Object> realmAccess = jwt.getClaim("realm_access");
			if (realmAccess != null && realmAccess.containsKey("roles")) {
				List<String> roles = (List<String>) realmAccess.get("roles");
				roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role)));
			}

			Map<String, Object> resourceAccess = jwt.getClaim("resource_access");
			if (resourceAccess != null) {
				resourceAccess.forEach((client, value) -> {
					Map<String, Object> clientData = (Map<String, Object>) value;
					List<String> roles = (List<String>) clientData.get("roles");

					if (roles != null) {
						roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role)));
					}
				});
			}

			return authorities;
		});

		return converter;
	}
}
