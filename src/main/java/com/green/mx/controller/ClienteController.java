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
import com.green.mx.model.request.RequestCliente;
import com.green.mx.model.response.Cliente;
import com.green.mx.service.IClienteService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class ClienteController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IClienteService service;

	/**
	 * API que retorna una lista de clientes
	 *
	 * @param accion - 1. Todos los clientes, 2. Clientees Activos, 3. Clientes inactivos
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud con lista
	 */
	@GetMapping(path = "/getClientes/{accion}", produces = JSON_PROD_CONS)
	public Estatus<Cliente> getclientes(@PathVariable(value = "accion") Integer accion) {
		return service.getClientes(accion);
	}

	/**
	 * API que permite crear, modificar, baja de clientes
	 *
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudCliente", consumes = JSON_PROD_CONS, produces = JSON_PROD_CONS)
	public Estatus<Cliente> crudCliente(@RequestBody RequestCliente request) {
		return service.crudCliente(request);
	}

}
