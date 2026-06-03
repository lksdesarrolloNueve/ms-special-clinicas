package com.green.mx.model.response;

import java.io.Serializable;

public class CatOperacion implements Serializable {

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;

	/**
	 * Id operacion
	 */
	private Integer operacionId;

	/**
	 * Clave operacion
	 */
	private String clave;

	/**
	 * Descripcion operacion
	 */
	private String descripcion;

	/**
	 * Operacion suma o resta
	 */
	private String operacion;

	/**
	 * Estatus
	 */
	private boolean estatus;

	/**
	 * @return the operacionId
	 */
	public Integer getOperacionId() {
		return operacionId;
	}

	/**
	 * @param operacionId the operacionId to set
	 */
	public void setOperacionId(Integer operacionId) {
		this.operacionId = operacionId;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the operacion
	 */
	public String getOperacion() {
		return operacion;
	}

	/**
	 * @param operacion the operacion to set
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}




}
