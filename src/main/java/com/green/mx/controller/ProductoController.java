package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestMasivoProductos;
import com.green.mx.model.response.Producto;
import com.green.mx.service.IProductoService;


@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class ProductoController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IProductoService service;
	
	/**
	 * API para retornar una lista de Productos
	 * @param accion - 1. Todos los Productos, 2. Productos Activos, 3. Productos inactivos
	 * @return {@link Estatus<Producto>} - Estado de la solicitud con lista
	 */
	@GetMapping(path ="/getProductos/{accion}",produces = JSON_PROD_CONS)
	public Estatus<Producto> getProductos(@PathVariable(value ="accion")Integer accion){
		return service.getProductos(accion);
	}
	
	/**
	 * API para permitir crear, modificar, baja de Productos
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Producto>} - Estado de la solicitud 
	 */
	@PostMapping(path = "/crudProducto",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Producto> crudProducto(@RequestBody Request request){
		return service.crudProducto(request);
	}
	
	
	/**
	 * API para la carga masiva de productos con Stock Inicial por Establecimiento
	 * @param requestProductos - Datos a registrar
	 * @return {@link Estatus<Producto>} - Estado de la solicitud 
	 */
	@PostMapping(path = "/crudMasivoProductos",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Producto> crudMasivoProductos(@RequestBody RequestMasivoProductos requestProductos){
		return service.crudMasivoProductos(requestProductos);
	}

}
