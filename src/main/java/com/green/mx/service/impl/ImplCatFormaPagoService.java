package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.CatFormaPagoMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.response.CatFormaPago;
import com.green.mx.service.ICatFormaPagoService;

@Service
public class ImplCatFormaPagoService implements ICatFormaPagoService {

	/**
	 * QUERY PARA OBTENER LAS CAJAS DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_formas_pago(?);";
	

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<CatFormaPago> daoFormaPago;

	
	/**
	 * Que para retornar una lista de formas pago
	 * @param accion 1 todos, 2 activos, 3 inactivos
	 * @return {@link Estatus<FormaPago>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<CatFormaPago> getCatFormasPago(Integer accion) {
		return daoFormaPago.getList(queryGetList,  
				new Object[] { accion},
				new CatFormaPagoMapper());
	}
	
	

}
