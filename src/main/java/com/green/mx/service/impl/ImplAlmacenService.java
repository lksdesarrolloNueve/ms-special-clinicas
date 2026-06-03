package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.AlmacenMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Almacen;
import com.green.mx.service.IAlmacenService;

@Service
public class ImplAlmacenService implements IAlmacenService{
	
	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_almacenes(?);";
	
	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDAlmacen = "SELECT * FROM almacen.crud_almacen(?,?)";
	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Almacen> daoAlmacen;

	
	/**
	 * Metodo que retorna una lista de alamcenes
	 * @param accion - 1. Todos los alamcenes, 2. Almacenes Activos, 3. Almacenes inactivos
	 * @return {@link Estatus<Almacen>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Almacen> getAlmacenes(Integer accion) {
		return daoAlmacen.getList(queryGetList, new Object[] {accion} ,new AlmacenMapper());
	}

	
	/**
	 * Metodo que permite crear, modificar, baja de alamcenes
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Almacen>} - Estado de la solicitud 
	 */
	@Override
	public Estatus<Almacen> crudAlmacen(Request request) {
		return daoAlmacen.crud(queryCRUDAlmacen, new Object[] {request.getDatos(), request.getAccion()});
	}

}
