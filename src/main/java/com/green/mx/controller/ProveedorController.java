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
import com.green.mx.model.request.RequestProveedor;
import com.green.mx.model.response.Proveedor;
import com.green.mx.service.IProveedorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class ProveedorController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IProveedorService service;

	/**
	 * Metodo para retornar una lista de Proveedores
	 * @param accion - 1. Todos los Proveedores, 2. Proveedores Activos, 3. Proveedores inactivos
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud con lista
	 */
	@GetMapping(path ="/getProveedores/{accion}",produces = JSON_PROD_CONS)
	public Estatus<Proveedor> getProveedores(@PathVariable(value ="accion")Integer accion){
		return service.getProveedores(accion);
	}

	/**
	 * Que para permitir crear, modificar, baja de Proveedores
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudProveedor",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Proveedor> crudProveedor(@RequestBody RequestProveedor request){
		return service.crudProveedor(request);
	}

}
