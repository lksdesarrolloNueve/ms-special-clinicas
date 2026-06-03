package com.green.mx.model.request;

import java.io.Serializable;

public class RequestCliente implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 7614368363109969594L;

	private String[] datos;

	private String[] detalle;

	private Integer accion;

	/**
	 * @return the datos
	 */
	public String[] getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(String[] datos) {
		this.datos = datos;
	}

	/**
	 * @return the detalle
	 */
	public String[] getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String[] detalle) {
		this.detalle = detalle;
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
