package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatFormaPago;

public interface ICatFormaPagoService {

	/**
	 * Que para retornar una lista de formas pago
	 * @param accion 1 todos, 2 activos, 3 inactivos
	 * @return {@link Estatus<FormaPago>} - Estado de la solicitud con lista
	 */
	Estatus<CatFormaPago> getCatFormasPago(Integer accion);

}
