package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestGetPaginado;
import com.green.mx.model.response.Entrada;
import com.green.mx.service.IEntradaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class EntradaController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IEntradaService service;
	
	/**
	 * API para retornar una lista de Entradas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud con lista
	 */
	@PostMapping(path = "/getEntradas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Entrada> getEntradas(@RequestBody RequestGetPaginado request){
		return service.getEntradas(request);
	}
	
	/**
	 * API para permitir crear, modificar, baja de Entradas
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud 
	 */
	@PostMapping(path = "/crudEntrada",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Entrada> crudEntrada(@RequestBody Request request){
		return service.crudEntrada(request);
	}

}
