package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.CatOperacionMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatOperacion;
import com.green.mx.service.ICatOperacionService;

@Service
public class ImplCatOperacionService implements ICatOperacionService  {
	
	/**
	 * QUERY PARA OBTENER LAS CAJAS DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_operaciones(?);";
	

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<CatOperacion> daoCatOperacion;

	
	/**
	 * Que para retornar una lista de operaciones
	 * @param accion 1 todos, 2 activos, 3 inactivos
	 * @return {@link Estatus<CatOperacion>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<CatOperacion> getCatOperacion(Integer accion) {
		return daoCatOperacion.getList(queryGetList,  
				new Object[] { accion},
				new CatOperacionMapper());
	}
	

}
