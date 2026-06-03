package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.SalidasMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestGetPaginado;
import com.green.mx.model.response.Salida;
import com.green.mx.service.ISalidaService;

@Service
public class ImplSalidaService implements ISalidaService{

	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_salidas(?,?,?,?);";

	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDSalida = "SELECT * FROM almacen.crud_salida(?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Salida> daoSalida;

	/**
	 * Metodo para retornar una lista de Salidas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Salida> getSalidas(RequestGetPaginado request) {
		return daoSalida.getList(queryGetList,
				new Object[] {request.getFiltros(), request.getAccion(),
						request.getNoPagina(), request.getTamPagina()},
				new SalidasMapper());
	}


	/**
	 * Metodo para permitir crear, modificar, baja de Salidas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Salida> crudSalida(Request request) {
		return daoSalida.crud(queryCRUDSalida,  new Object[] {request.getDatos(), request.getAccion()});
	}

}
