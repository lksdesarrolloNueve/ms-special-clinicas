package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.EntradaMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestGetPaginado;
import com.green.mx.model.response.Entrada;
import com.green.mx.service.IEntradaService;

@Service
public class ImplEntradaService implements IEntradaService{


	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_entradas(?,?,?,?);";

	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDEntrada = "SELECT * FROM almacen.crud_entrada(?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Entrada> daoEntrada;

	/**
	 * Metodo para retornar una lista de Entradas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Entrada> getEntradas(RequestGetPaginado request) {
		return  daoEntrada.getList(queryGetList,
				new Object[] {request.getFiltros(), request.getAccion(),
						request.getNoPagina(), request.getTamPagina()},
				new EntradaMapper());
	}


	/**
	 * Metodo para permitir crear, modificar, baja de Entradas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Entrada> crudEntrada(Request request) {
		return daoEntrada.crud(queryCRUDEntrada,  new Object[] {request.getDatos(),request.getAccion()});
	}

}
