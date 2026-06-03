package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ApartadoMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Apartado;
import com.green.mx.service.IApartadoService;

@Service
public class ImplApartadoService implements IApartadoService{

	/**
	 * Query para listar apartados con filtro
	 */
	private String queryGetApartado = "SELECT * FROM almacen.get_apartados(?,?)";


	/**
	 * Instancia para listar apartados
	 */
	@Autowired
	private IGestionDAO<Apartado> daoApartado;

	/**
	 * Metodo para listar los apartados
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<Apartado>} - Estatus con respuesta
	 */
	@Override
	public Estatus<Apartado> getApartados(Request request) {
		return daoApartado.getList(queryGetApartado,
				new Object[] {request.getDatos(),request.getAccion()}, new ApartadoMapper());
	}




}
