/**
 *
 */
package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ReporteEntradaMapper;
import com.green.mx.mapper.ReporteSalidaMapper;
import com.green.mx.mapper.TotalOperacionMapper;
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
@Service
public class ImplReporteVentaService implements IReporteVentaService{

	/**
	 * QUERY PARA OBTENER LAS VENTAS REALIZADAS
	 */
	private String queryReportVenta ="SELECT * FROM almacen.reporte_ventas(?,?);";

	/**
	 * Query para reporte de entrdas
	 */
	private String queryReporteEntradas = "SELECT * FROM almacen.get_reportes_entradas(?,?);";


	/**
	 * Query para reporte de salidas
	 */
	private String queryReporteSalidas = "SELECT * FROM almacen.get_reportes_salidas(?,?);";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<String> dao;

	/**
	 * Query para obtener los totales por operaciones
	 */
	private String queryGetTotales = "SELECT * FROM almacen.get_reportes_totales_operaciones(?,?);";

	/**
	 * Instancia de acceso a datos para totales
	 */
	@Autowired
	private IGestionDAO<TotalOperacion> daoTotales;


	/**
	 * Instancia de acceso a datos entrdas
	 */
	@Autowired
	private IGestionDAO<ReporteEntrada> daoReporteEntrada;


	/**
	 * Instancia de acceso a datos entrdas
	 */
	@Autowired
	private IGestionDAO<ReporteSalida> daoReporteSalida;

	/**
	 * Metodo para obtener el reporte de ventas diarias, semanale,mensuales
	  * @param datos -Infomacion para filtrar el reporte de ventas
	 * @param accion - 1. Reporte Diario 2.- Reporte Semanal 3.- Reporte Mensual
	 * @return {@link String} - Informacion en formato JSON con los datos de ventas
	 */
	@Override
	public String reporteVentas(String[] datos, Integer accion) {
		return dao.getJSON(queryReportVenta, new Object[]{datos,accion});
	}

	/**
	 * Metodo que retorna la lista de totales por filtro
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<TotalOperacion>} - Info con los datos
	 */
	@Override
	public Estatus<TotalOperacion> getTotalesOperacion(Request request) {
		return daoTotales.getList(queryGetTotales, new Object[] {request.getDatos(),request.getAccion()}, new TotalOperacionMapper());
	}

	/**
	 * Metodo retorna la lista de entradas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteEntrada>} - Info con los datos
	 */
	@Override
	public Estatus<ReporteEntrada> getReporteEntradas(Request request) {
		return daoReporteEntrada.getList(queryReporteEntradas, new Object[] {request.getDatos(),request.getAccion()}, new ReporteEntradaMapper());
	}

	/**
	 * Metodo retorna la lista de salidas para reporte de graficas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus<ReporteSalida>} - Info con los datos
	 */
	@Override
	public Estatus<ReporteSalida> getReporteSalidas(Request request) {
		return daoReporteSalida.getList(queryReporteSalidas, new Object[] {request.getDatos(),request.getAccion()}, new ReporteSalidaMapper());
	}

}
