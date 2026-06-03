package com.green.mx.model.request;

import java.io.Serializable;

public class RequestProveedor implements Serializable{
	
	
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -4491450861627812837L;

	/**
	 * Arreglo de datos
	 */
	private String[][] datos;
	
	/**
	 * Accion a realizar 
	 */
	private Integer accion;

	/**
	 * @return the datos
	 */
	public String[][] getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(String[][] datos) {
		this.datos = datos;
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
