/**
 * 
 */
package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.ReporteEntrada;
import com.green.mx.model.response.ReporteSalida;
import com.green.mx.model.response.TotalOperacion;
import com.green.mx.service.IReporteVentaService;

/**
 * @author lksbaassadecv
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class ReporteVentaController {
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IReporteVentaService service;
	
	/**
	 * API para generar reporte de ventas
	 * @param request - Información con los datos a procesar, con accion a realizar 
	 * @return {@link String} - Respuesta de la solicitud 
	 */
	@PostMapping(path = "/getReporteVenta",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public String getReporteVenta(@RequestBody Request request){
		return service.reporteVentas(request.getDatos(), request.getAccion());
	}
	
	
	/**
	 * API que retorna la lista de totales por filtro
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<TotalOperacion>} - Info con los datos
	 */
	@PostMapping(path = "/getTotalesOperacion",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<TotalOperacion> getTotalesOperacion(@RequestBody Request request){
		return service.getTotalesOperacion(request);
	}
	
	/**
	 * Metodo retorna la lista de entradas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteEntrada>} - Info con los datos
	 */
	@PostMapping(path = "/getReporteEntradas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<ReporteEntrada> getReporteEntradas(@RequestBody Request request){
		return service.getReporteEntradas(request);
	}
	
	/**
	 * Metodo retorna la lista de salidas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteSalida>} - Info con los datos
	 */
	@PostMapping(path = "/getReporteSalidas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<ReporteSalida> getReporteSalidas(@RequestBody Request request){
		return service.getReporteSalidas(request);
	}

}
