package com.green.mx.model.response;

import java.io.Serializable;

public class Salida implements Serializable{
	
	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = 196006494554258226L;

	private Long salidaID;
	
	private String producto;
	
	private Integer cantidad;
	
	private String almacen;
	
	private String usuario;
	
	private String fecha;
	
	private Long totalRecords;

	/**
	 * @return the salidaID
	 */
	public Long getSalidaID() {
		return salidaID;
	}

	/**
	 * @param salidaID the salidaID to set
	 */
	public void setSalidaID(Long salidaID) {
		this.salidaID = salidaID;
	}

	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the almacen
	 */
	public String getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the totalRecords
	 */
	public Long getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	

}
