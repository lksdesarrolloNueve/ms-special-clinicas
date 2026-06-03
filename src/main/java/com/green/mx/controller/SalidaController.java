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
import com.green.mx.model.response.Salida;
import com.green.mx.service.ISalidaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class SalidaController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private ISalidaService service;
	
	/**
	 * API para retornar una lista de Salidas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud con lista
	 */
	@PostMapping(path = "/getSalidas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Salida> getSalidas(@RequestBody RequestGetPaginado request){
		return service.getSalidas(request);
	}
	
	/**
	 * API para permitir crear, modificar, baja de Salidas
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Salida>} - Estado de la solicitud 
	 */
	@PostMapping(path = "/crudSalida",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Salida> crudSalida(@RequestBody Request request){
		return service.crudSalida(request);
	}

}
