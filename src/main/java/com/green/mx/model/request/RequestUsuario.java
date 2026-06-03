package com.green.mx.model.request;

import java.io.Serializable;

public class RequestUsuario implements Serializable{



	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = -7355123390428582634L;

	/**
	 * Arreglo de datos
	 */
	private String[] datos;

	private String[] almacenes;

	/**
	 * Accion a realizar
	 */
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
	 * @return the almacenes
	 */
	public String[] getAlmacenes() {
		return almacenes;
	}

	/**
	 * @param almacenes the almacenes to set
	 */
	public void setAlmacenes(String[] almacenes) {
		this.almacenes = almacenes;
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
