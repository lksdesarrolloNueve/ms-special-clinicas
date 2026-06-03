package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.service.IDinamicoService;
import com.green.mx.model.Request;

@RestController
@CrossOrigin("*")
@RequestMapping("/servicios")
public class ServiciosController {
	
	/**
	 * Constante JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	// Query para calcular inversiones
	@Value("${query.crud_servicios}")
	private String queryCRUDServicios;

	// Instancia service dinamico
	@Autowired
	private IDinamicoService service;
	
	
	
	@PostMapping(path = "/servicios", consumes = JSON_PROD_CONS, produces = JSON_PROD_CONS)
	public String crudProspectos(@RequestBody Request request) {
		return service.execQueryDinamico(request, queryCRUDServicios);
	}

}
