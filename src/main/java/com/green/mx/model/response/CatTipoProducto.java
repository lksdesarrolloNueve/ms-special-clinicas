package com.green.mx.model.response;

import java.io.Serializable;

public class CatTipoProducto implements Serializable{

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;
	
	/**
	 * Id tipo producto
	 */
	private Integer idTipoProducto;
	
	/**
	 * Clave tipo producto
	 */
	private String cveTipoProducto;
	
	/**
	 * Descripcion
	 */
	private String descripcion;
	
	/**
	 * Estatus
	 */
	private Boolean estatus;

	/**
	 * @return the idTipoProducto
	 */
	public Integer getIdTipoProducto() {
		return idTipoProducto;
	}

	/**
	 * @param idTipoProducto the idTipoProducto to set
	 */
	public void setIdTipoProducto(Integer idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	/**
	 * @return the cveTipoProducto
	 */
	public String getCveTipoProducto() {
		return cveTipoProducto;
	}

	/**
	 * @param cveTipoProducto the cveTipoProducto to set
	 */
	public void setCveTipoProducto(String cveTipoProducto) {
		this.cveTipoProducto = cveTipoProducto;
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
	 * @return the estatus
	 */
	public Boolean getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	
	

	
	
	
}
