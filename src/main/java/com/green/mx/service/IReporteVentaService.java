/**
 * 
 */
package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.ReporteEntrada;
import com.green.mx.model.response.ReporteSalida;
import com.green.mx.model.response.TotalOperacion;

/**
 * @author lksbaassadecv
 *
 */
public interface IReporteVentaService {
	/**
	 * Metodo para retornar una lista de las ventas generadas
	 * @param datos -Infomacion para filtrar el reporte de ventas
	 * @param accion - 1. Reporte Diario 2.- Reporte Semanal 3.- Reporte Mensual
	 * @return {@link String} - JSON String
	 */
	String reporteVentas(String[] datos ,Integer accion);
	
	/**
	 * Que retorna la lista de totales por filtro
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<TotalOperacion>} - Info con los datos
	 */
	Estatus<TotalOperacion> getTotalesOperacion(Request request);
	
	
	/**
	 * Que retorna la lista de entradas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteEntrada>} - Info con los datos
	 */
	Estatus<ReporteEntrada> getReporteEntradas(Request request);
	
	
	/**
	 * Que retorna la lista de salidas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteSalida>} - Info con los datos
	 */
	Estatus<ReporteSalida> getReporteSalidas(Request request);

}
