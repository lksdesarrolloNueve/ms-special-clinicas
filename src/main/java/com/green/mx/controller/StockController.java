package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Stock;
import com.green.mx.service.IStockService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class StockController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IStockService service;
	
	/**
	 * API para obtener el stock de los productos en Almacenes
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@PostMapping(path = "/getStock",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Stock> getStock(@RequestBody Request request){
		return service.getStock(request);
	}

}
