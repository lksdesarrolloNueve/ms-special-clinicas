package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatFormaPago;

import com.green.mx.service.ICatFormaPagoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class CatFormaPagoController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	
	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private ICatFormaPagoService service;
	
	/**
	 * Que para retornar una lista de formas pago
	 * @param accion 1 todos, 2 activos, 3 inactivos
	 * @return {@link Estatus<FormaPago>} - Estado de la solicitud con lista
	 */
	@GetMapping(path = "/getFormasPago/{accion}",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<CatFormaPago> getFormaPago(@PathVariable(value ="accion")Integer accion){
		return service.getCatFormasPago(accion);
	}
	
	
	
}
