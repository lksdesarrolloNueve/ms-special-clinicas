package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.StockMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Stock;
import com.green.mx.service.IStockService;

@Service
public class ImplStockService implements IStockService{
	
	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_stock_productos(?,?);";

	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Stock> daoStock;

	/**
	 * Metodo para obtener el stock de los productos en Almacenes
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@Override
	public Estatus<Stock> getStock(Request request) {
		return daoStock.getList(queryGetList, 
				new Object[] {request.getDatos(),request.getAccion()},
				new StockMapper());
	}

}
