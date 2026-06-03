package com.green.mx.controller.special;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.mx.model.Request;
import com.green.mx.service.IDinamicoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/special")
public class EmpresaController {
	
	/**
	 * Constante JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	// Query para calcular inversiones
	private static final String QUERY_CRUD_EMPRESA = "SELECT * FROM special.crud_empresa(?,?)";

	// Instancia service dinamico
	@Autowired
	private IDinamicoService service;
	
	
	
	@PostMapping(path = "/empresa", consumes = JSON_PROD_CONS, produces = JSON_PROD_CONS)
	public String crudEmpresa(@AuthenticationPrincipal Jwt jwt, @RequestBody Request request) throws JsonMappingException, JsonProcessingException {
		
		String resEmpresa = service.execQueryDinamico(request, QUERY_CRUD_EMPRESA);
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(resEmpresa);

		System.out.println(jsonNode.get("codigo").asInt() + " "+jsonNode.get("mensaje").asText());
		
		//if (jsonNode.get("codigo").asInt() == 1) {
		
		String userId = jwt.getSubject();
		
		System.out.println("Este es el usuario "+userId);
		
		Keycloak keycloak = KeycloakBuilder.builder()
			    .serverUrl("http://localhost:8080")
			    .realm("master")
			    .clientId("admin-cli") // o mejor un cliente propio
			    .username("admin")
			    .password("058gLt3H3XQBtbJ")
			    .build();

		UserResource userResource = keycloak.realm("empresa")
		    .users()
		    .get(userId);

		Map<String, List<String>> attributes = new HashMap<>();
		attributes.put("profile_completed", List.of("true"));
		attributes.put("tenant_id", List.of(jsonNode.get("tenant_id").asText()));

		UserRepresentation user = userResource.toRepresentation();
		user.setAttributes(attributes);

		userResource.update(user);
		
		//}
		
		return resEmpresa;
	}
	

}
