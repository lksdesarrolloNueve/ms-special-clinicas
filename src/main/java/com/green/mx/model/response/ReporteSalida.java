package com.green.mx.model.response;

import java.io.Serializable;


public class ReporteSalida implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 7580230178794299624L;

	private String producto;

	private Long cantidad;

	private Long stock;

	private String usuario;

	private String establecimiento;

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
	public Long getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the stock
	 */
	public Long getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(Long stock) {
		this.stock = stock;
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
	 * @return the establecimiento
	 */
	public String getEstablecimiento() {
		return establecimiento;
	}

	/**
	 * @param establecimiento the establecimiento to set
	 */
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}




}
