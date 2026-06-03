package com.green.mx.service;


import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Caja;
import com.green.mx.model.response.MovSesionCaja;
import com.green.mx.model.response.SesionCaja;


public interface ICajaService {

	/**
	 * Que para retornar una lista de Cajas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Salida>} - Estado de la solicitud con lista
	 */
	Estatus<Caja> getCajas(Request request);	
	
	/**
	 * Que para permitir crear, modificar, baja de Cajas
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Caja>} - Estado de la solicitud 
	 */
	Estatus<Caja> crudCaja(Request request);
	
	/**
	 * Que para obtener las cajas disponibles para sesion ó la caja de la sesion
	 * @param usuario - Usuario/ID para buscar sesion disponible
	 * @param almacenID - Id del almacen a filtrar
	 * @return {@link String} - Informacion en formato JSON con los datos de las cajas
	 */
	String getCajasDisponibles(String usuario, Integer almacenID);
	
	/**
	 * Que para registrar el inicio de sesion de un cajero
	 * @param request - Informacion con los datos a registrar
	 * @return {@link String} - Informacion en formato JSON con los datos de la sesion
	 */
	String crudSesionCaja(Request request);
	
	/**
	 * Que para obtener una lista de Sesiones de Cajas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	Estatus<SesionCaja> getSesionesCajas(Request request);
	
	/**
	 * Que para obtener una lista de saldos movimientos caja
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	Estatus<MovSesionCaja> getSaldoMovCaja(Request request);


}
