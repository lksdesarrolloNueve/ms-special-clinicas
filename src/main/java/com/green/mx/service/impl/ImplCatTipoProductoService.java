package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.CatTipoProductoMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatTipoProducto;
import com.green.mx.service.ICatTipoProductoService;

@Service
public class ImplCatTipoProductoService implements ICatTipoProductoService {


	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_cat_tipo_producto(?);";


	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<CatTipoProducto> daoCatTP;

	/**
	 * Que que retorna una lista de cat. tipo producto
	 * @param accion - 1. Todos , 2. Activos, 3.inactivos
	 * @return {@link Estatus<CatTipoProducto>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<CatTipoProducto> getCatTipoProducto(Integer accion) {

		return daoCatTP.getList(queryGetList, new Object[] {accion} ,new CatTipoProductoMapper());

	}

}
