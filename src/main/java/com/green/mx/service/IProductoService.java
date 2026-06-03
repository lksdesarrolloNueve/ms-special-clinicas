package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestMasivoProductos;
import com.green.mx.model.response.Producto;

public interface IProductoService {

	/**
	 * Que para retornar una lista de Productos
	 * @param accion - 1. Todos los Productos, 2. Productos Activos, 3. Productos inactivos
	 * @return {@link Estatus<Producto>} - Estado de la solicitud con lista
	 */
	Estatus<Producto> getProductos(Integer accion);

	/**
	 * Que para permitir crear, modificar, baja de Productos
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Producto>} - Estado de la solicitud
	 */
	Estatus<Producto> crudProducto(Request request);

	/**
	 * Que para la carga masiva de productos con Stock Inicial por Establecimiento
	 * @param requestProductos - Datos a registrar
	 * @return {@link Estatus<Producto>} - Estado de la solicitud
	 */
	Estatus<Producto> crudMasivoProductos(RequestMasivoProductos requestProductos);

}
