package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.RequestProveedor;
import com.green.mx.model.response.Proveedor;

public interface IProveedorService {

	/**
	 * Que para retornar una lista de Proveedores
	 * @param accion - 1. Todos los Proveedores, 2. Proveedores Activos, 3. Proveedores inactivos
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud con lista
	 */
	Estatus<Proveedor> getProveedores(Integer accion);

	/**
	 * Que para permitir crear, modificar, baja de Proveedores
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud
	 */
	Estatus<Proveedor> crudProveedor(RequestProveedor request);

}
