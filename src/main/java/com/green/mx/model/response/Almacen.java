package com.green.mx.model.response;

import java.io.Serializable;

public class Almacen implements Serializable{

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;

	/**
	 * Id del alamcaen
	 */
	private Integer almacenID;

	/**
	 * Nombre del Alamcen
	 */
	private String nombre;

	/**
	 * Descripcion del alamcen
	 */
	private String descripcion;

	/**
	 * FEcha de alta
	 */
	private String fechaAlta;

	/**
	 * Estatus del almacen
	 */
	private Boolean estatus;

	/**
	 * @return the almacenID
	 */
	public Integer getAlmacenID() {
		return almacenID;
	}

	/**
	 * @param almacenID the almacenID to set
	 */
	public void setAlmacenID(Integer almacenID) {
		this.almacenID = almacenID;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
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
