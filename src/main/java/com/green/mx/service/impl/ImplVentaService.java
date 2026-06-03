package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ReimprimirTicketMapper;
import com.green.mx.mapper.VentaMapper;
import com.green.mx.mapper.VtaFPSesionMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestVenta;
import com.green.mx.model.response.ReimprimirTicket;
import com.green.mx.model.response.Venta;
import com.green.mx.model.response.VtaFPSesion;
import com.green.mx.service.IVentaService;

@Service
public class ImplVentaService implements IVentaService {
	
	
	/**
	 * Query para CRUDS de ventas
	 */
	private String queryCRUDVenta = "SELECT * FROM almacen.crud_ventas(?,?,?,?)";
	
	/*
	 * Query para listar ventas por forma de pago
	 */
	private String queryGetVentasXFPSesion = "SELECT * FROM almacen.get_ventas_x_form_pago_x_sesion(?,?);";
	
	/**
	 * Query obtiene detalle de venta por clavee
	 */
	private String queryGetVentaCve = "SELECT * FROM almacen.get_venta(?,?);";
	
	/**
	 * Query obtiene detalle de las ventas por fecha y usuario
	 */
	private String queryGetReimprimirTicket = "select * from almacen.get_reimprimirTicket(?,?);";
	
	/**
	 * Instancia para acceso al DAO
	 */
	@Autowired
	private IGestionDAO<String[]> crudVenta;
	
	/**
	 * Instancia para listar Ventas por Forma de PAgo X sesion
	 */
	@Autowired
	private IGestionDAO<VtaFPSesion> daoVFPSesion;
	
	/**
	 * Instancia para listar ventas por clave
	 */
	@Autowired
	private IGestionDAO<Venta> daoVentaCve;
	
	/**
	 * Instancia para listar ventas por cajero y fecha
	 */
	@Autowired
	private IGestionDAO<ReimprimirTicket> daoReimprimir;
	
	/**
	 * Metodo que permite crear, modificar, baja de ventas
	 * 
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<String[]>} - Estado de la solicitud
	 */
	@Override
	public String crudVenta(RequestVenta request){
		return crudVenta.getJSON(queryCRUDVenta, new Object[] {request.getVenta(), request.getVentaDetalle(),request.getDetallePago(), request.getAccion()});
	}


	/**
	 * Metodo para listar las ventas/movimientos por sesion
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<VtaFPSesion>} - Estatus con respuesta
	 */
	@Override
	public Estatus<VtaFPSesion> getVentasXFPXSesion(Request reqBusqueda) {
		return daoVFPSesion.getList(queryGetVentasXFPSesion, 
				new Object[] {reqBusqueda.getDatos(),reqBusqueda.getAccion()}, new VtaFPSesionMapper());
	}


	/**
	 * Metodo para listar las ventas detalle por ticket
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<Venta>} - Estatus con respuesta
	 */
	@Override
	public Estatus<Venta> getVentaByCve(Request reqBusqueda) {
		return daoVentaCve.getList(queryGetVentaCve, 
				new Object[] {reqBusqueda.getDatos(), reqBusqueda.getAccion()}, new VentaMapper());
	}


	/**
	 * Metodo para listar las ventas del dia
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<ReimprimirTicket>} - Estatus con respuesta
	 */
	@Override
	public Estatus<ReimprimirTicket> getReimpresionTicket(Request reqBusqueda) {

		return daoReimprimir.getList(queryGetReimprimirTicket, new Object[] {reqBusqueda.getDatos(), reqBusqueda.getAccion()},
				new ReimprimirTicketMapper());
	}

	
}
