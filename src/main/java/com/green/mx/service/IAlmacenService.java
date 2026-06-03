package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Almacen;

public interface IAlmacenService {
	
	/**
	 * Que que retorna una lista de alamcenes
	 * @param accion - 1. Todos los alamcenes, 2. Almacenes Activos, 3. Almacenes inactivos
	 * @return {@link Estatus<Almacen>} - Estado de la solicitud con lista
	 */
	Estatus<Almacen> getAlmacenes(Integer accion);
	
	/**
	 * Que que permite crear, modificar, baja de alamcenes
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Almacen>} - Estado de la solicitud 
	 */
	Estatus<Almacen> crudAlmacen(Request request);

}
