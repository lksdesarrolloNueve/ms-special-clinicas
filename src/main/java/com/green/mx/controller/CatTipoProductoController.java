package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatTipoProducto;
import com.green.mx.service.ICatTipoProductoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class CatTipoProductoController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private ICatTipoProductoService service;


	/**
	 * API que que retorna una lista de cat. tipo producto
	 * @param accion - 1. Todos , 2. Activos, 3.inactivos
	 * @return {@link Estatus<CatTipoProducto>} - Estado de la solicitud con lista
	 */
	@GetMapping(path ="/getCatTiposProductos/{accion}",produces = JSON_PROD_CONS)
	public Estatus<CatTipoProducto> getAlamcenes(@PathVariable(value ="accion")Integer accion){
		return service.getCatTipoProducto(accion);
	}

}
