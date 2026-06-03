package com.green.mx.service;



import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestVenta;
import com.green.mx.model.response.ReimprimirTicket;
import com.green.mx.model.response.Venta;
import com.green.mx.model.response.VtaFPSesion;




public interface IVentaService {

	/**
	 * Que para permitir crear, modificar, baja de ventas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link String} - Json estado de la solicitud
	 */
	 String crudVenta (RequestVenta reqVenta);

	/**
	 * Que para listar las ventas/movimientos por sesion
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<VtaFPSesion>} - Estatus con respuesta
	 */
	Estatus<VtaFPSesion> getVentasXFPXSesion(Request reqBusqueda);


	/**
	 * Lista el detalle de venta por ticket.
	 * @param reqVentaCve
	 * @return
	 */
	Estatus<Venta> getVentaByCve(Request reqVentaCve);

	/**
	 * Que para obtener los datos de reimpresion de ticket
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<ReimprimirTicket>} - Estatus con respuesta
	 */
	Estatus<ReimprimirTicket> getReimpresionTicket(Request reqBusqueda);


}
