package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Stock;

public interface IStockService {

	/**
	 * Que para obtener el stock de los productos en Almacenes
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	Estatus<Stock> getStock(Request request);

}
