package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Apartado;


public interface IApartadoService {
	
	/**
	 * Que para listar los apartados
	 * @param resquest - Datos a filtrar
	 * @return {@link Estatus<Apartado>} - Estatus con respuesta
	 */
	Estatus<Apartado> getApartados(Request request);

}
