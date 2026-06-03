package com.green.mx.model.request;

import java.io.Serializable;

public class RequestVenta  implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 7614368363109969594L;


	/**
	 * Arreglo de datos
	 */
	private String[] venta;


	/**
	 * Arreglo de datos
	 */
	private String[][] ventaDetalle;


	/**
	 * Arreglo de datos
	 */
	private String[][] detallePago;

	/**
	 * Accion
	 */
	private Integer accion;

	/**
	 * @return the venta
	 */
	public String[] getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(String[] venta) {
		this.venta = venta;
	}



	/**
	 * @return the ventaDetalle
	 */
	public String[][] getVentaDetalle() {
		return ventaDetalle;
	}

	/**
	 * @param ventaDetalle the ventaDetalle to set
	 */
	public void setVentaDetalle(String[][] ventaDetalle) {
		this.ventaDetalle = ventaDetalle;
	}

	/**
	 * @return the detallePago
	 */
	public String[][] getDetallePago() {
		return detallePago;
	}

	/**
	 * @param detallePago the detallePago to set
	 */
	public void setDetallePago(String[][] detallePago) {
		this.detallePago = detallePago;
	}

	/**
	 * @return the accion
	 */
	public Integer getAccion() {
		return accion;
	}

	/**
	 * @param accion the accion to set
	 */
	public void setAccion(Integer accion) {
		this.accion = accion;
	}



}
