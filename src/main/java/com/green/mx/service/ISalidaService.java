package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestGetPaginado;
import com.green.mx.model.response.Salida;

public interface ISalidaService {

	/**
	 * Que para retornar una lista de Salidas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud con lista
	 */
	Estatus<Salida> getSalidas(RequestGetPaginado request);

	/**
	 * Que para permitir crear, modificar, baja de Salidas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud
	 */
	Estatus<Salida> crudSalida(Request request);

}
