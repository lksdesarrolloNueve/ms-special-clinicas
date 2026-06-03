package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.RequestCliente;
import com.green.mx.model.response.Cliente;

public interface IClienteService {
	
	/**
	 * Que que retorna una lista de clientes
	 * 
	 * @param accion - 1. Todos los clientes, 2. Clientees Activos, 3. Clientees    inactivos
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud con lista
	 */
	Estatus<Cliente> getClientes(Integer accion);

	/**
	 * Que que permite crear, modificar, baja de clientes
	 * 
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud
	 */
	Estatus<Cliente> crudCliente(RequestCliente request);

}
