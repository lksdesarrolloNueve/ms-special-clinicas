package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatOperacion;

public interface ICatOperacionService {

	/**
	 * Que para retornar una lista operaciones
	 * @param accion 1 todos, 2 activos, 3 inactivos
	 * @return {@link Estatus<Operacion>} - Estado de la solicitud con lista
	 */
	Estatus<CatOperacion> getCatOperacion(Integer accion);

}
