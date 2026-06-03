package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestGetPaginado;
import com.green.mx.model.response.Entrada;


public interface IEntradaService {

	/**
	 * Que para retornar una lista de Entradas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud con lista
	 */
	Estatus<Entrada> getEntradas(RequestGetPaginado request);

	/**
	 * Que para permitir crear, modificar, baja de Entradas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud
	 */
	Estatus<Entrada> crudEntrada(Request request);

}
