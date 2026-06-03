package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.CajaMapper;
import com.green.mx.mapper.MovSesionCajaMapper;
import com.green.mx.mapper.SesionCajaMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Caja;
import com.green.mx.model.response.MovSesionCaja;
import com.green.mx.model.response.SesionCaja;
import com.green.mx.service.ICajaService;



@Service
public class ImplCajaService implements ICajaService {

	/**
	 * QUERY PARA OBTENER LAS CAJAS DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_cajas(?,?);";
	
	/**
	 * Query para CRUDS de Cajas
	 */
	private String queryCRUDCaja = "SELECT * FROM almacen.crud_caja(?,?)";

	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetCajas ="SELECT * FROM almacen.get_cajas_disponibles_sesion(?,?);";
	
	
	/**
	 * Query tipo CRUD para Registrar Sesion de Caja
	 */
	private String queryCRUDSesionCaja ="SELECT * FROM almacen.crud_sesion_caja(?,?);";
	
	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetSesionesCajas ="SELECT * FROM almacen.get_sesiones_cajas(?,?);";
	
	/**
	 * QUERY PARA OBTENER LOS SALDOS DE LOS MOVIMIENTOS CAJA
	 */
	private String queryGetMovSesion ="SELECT * FROM almacen.get_saldos_cajas(?,?);";


	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Caja> daoCaja;
	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<String> daoCajasS;
	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<SesionCaja> daoSesionCajas;
	
	
	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<MovSesionCaja> daoMovSesion;
	
	/**
	 * Metodo para retornar una lista de Cajas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Caja>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Caja> getCajas(Request request) {
		return daoCaja.getList(queryGetList,  
				new Object[] {request.getDatos(), request.getAccion()},
				new CajaMapper());
	}
	

	/**
	 * Metodo para permitir crear, modificar, baja de Cajas
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Salida>} - Estado de la solicitud 
	 */
	@Override
	public Estatus<Caja> crudCaja(Request request) {
		return daoCaja.crud(queryCRUDCaja,  new Object[] {request.getDatos(), request.getAccion()});
	}



	/**
	 * Metodo para obtener las cajas disponibles para sesion ó la caja de la sesion
	 * @param usuario - Usuario/ID para buscar sesion disponible
	 * @param almacenID - Id del almacen a filtrar
	 * @return {@link String} - Informacion en formato JSON con los datos de las cajas
	 */
	@Override
	public String getCajasDisponibles(String usuario, Integer almacenID) {
		return daoCajasS.getJSON(queryGetCajas, new Object [] {usuario, almacenID});
	}


	/**
	 * Metodo para registrar el inicio de sesion de un cajero
	 * @param request - Informacion con los datos a registrar
	 * @return {@link String} - Informacion en formato JSON con los datos de la sesion
	 */
	@Override
	public String crudSesionCaja(Request request) {
		return daoCajasS.getJSON(queryCRUDSesionCaja, new Object[] {request.getDatos(), request.getAccion()});
	}

	/**
	 * Metodo para obtener una lista de Sesiones de Cajas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@Override
	public Estatus<SesionCaja> getSesionesCajas(Request request) {
		return daoSesionCajas.getList(queryGetSesionesCajas, 
				new Object[] {request.getDatos(),request.getAccion()},
				new SesionCajaMapper());
	}
	
	
	/**
	 * Metodo para obtener una lista de saldos de la caja
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@Override
	public Estatus<MovSesionCaja> getSaldoMovCaja(Request request) {
		return daoMovSesion.getList(queryGetMovSesion, 
				new Object[] {request.getDatos(),request.getAccion()},
				new MovSesionCajaMapper());
	}
	
	
}

