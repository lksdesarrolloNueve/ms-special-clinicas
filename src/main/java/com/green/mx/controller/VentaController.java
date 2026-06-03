package com.green.mx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestVenta;
import com.green.mx.model.response.ReimprimirTicket;
import com.green.mx.model.response.Venta;
import com.green.mx.model.response.VtaFPSesion;
import com.green.mx.service.IVentaService;



@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class VentaController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IVentaService service;


	/**
	 * API para permitir crear, modificar, baja de Entradas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Entrada>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudVenta",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public String  crudVenta(@RequestBody RequestVenta request){
		return service.crudVenta(request);
	}



	/**
	 * API para listar las ventas/movimientos por sesion
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<VtaFPSesion>} - Estatus con respuesta
	 */
	@PostMapping(path = "/getVentasXFPXSesion",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<VtaFPSesion> getVentasXFPXSesion(@RequestBody Request request){
		return service.getVentasXFPXSesion(request);
	}


	/**
	 * API para listar las ventas detalle por clave
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<Venta>} - Estatus con respuesta
	 */
	@PostMapping(path = "/getVentaCve",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Venta> getVentaByCve(@RequestBody Request request){
		return service.getVentaByCve(request);
	}

	/**
	 * API para listar las ventas por dia
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<ReimprimirTicket>} - Estatus con respuesta
	 */
	@PostMapping(path = "/getReimprimirTicket",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<ReimprimirTicket> getReimprimirTicket(@RequestBody Request request){
		return service.getReimpresionTicket(request);
	}

}
