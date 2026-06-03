package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatTipoProducto;

public interface ICatTipoProductoService {
	
	/**
	 * Que que retorna una lista de cat. tipo producto
	 * @param accion - 1. Todos , 2. Activos, 3.inactivos
	 * @return {@link Estatus<CatTipoProducto>} - Estado de la solicitud con lista
	 */
	Estatus<CatTipoProducto> getCatTipoProducto(Integer accion);
	

}
