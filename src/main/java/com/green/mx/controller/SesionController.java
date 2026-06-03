package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin("*")
@RequestMapping("/sesion")
public class SesionController {

	/**
	 * URL Keycloick
	 */
	@Value("${varKeycloak.url.login}")
	private String urlLogin;

	@Value("${varKeycloak.grant_type}")
	private String granTYPE;

	@Value("${varKeycloak.client_id}")
	private String clienteID;


	@Value("${varKeycloak.refresh_token}")
	private String granTYPERefreshToken;



	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";




	@PostMapping(path = "/login/{usuario}/{contrasenia}", produces = JSON_PROD_CONS)
	public String login(@PathVariable(value = "usuario") String usuario,
			@PathVariable(value = "contrasenia") String contrasenia) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		// si necesita pasar parámetros de formulario en la solicitud con encabezados.
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("client_id", clienteID);
		map.add("grant_type", granTYPE);
		map.add("username", usuario);
		map.add("password", contrasenia);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(urlLogin, request, String.class);

		return responses.getBody();
	}


	@PostMapping(path = "/refreshToken/{token}", produces = JSON_PROD_CONS)
	public String refreshToken(@PathVariable(value = "token") String token) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		// si necesita pasar parámetros de formulario en la solicitud con encabezados.
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("client_id", clienteID);
		map.add("grant_type", granTYPERefreshToken);
		map.add("refresh_token", token);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(urlLogin, request, String.class);

		return responses.getBody();
	}

}
