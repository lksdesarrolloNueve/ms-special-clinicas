package com.green.mx.model.request;

import java.io.Serializable;

public class RequestMasivoProductos implements Serializable{
	
	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = 4659935118619601297L;

	private String[][] productos;
	
	private Integer alamcenID;
	
	private String usuarioID;
	
	private Integer accion;

	/**
	 * @return the productos
	 */
	public String[][] getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(String[][] productos) {
		this.productos = productos;
	}

	/**
	 * @return the alamcenID
	 */
	public Integer getAlamcenID() {
		return alamcenID;
	}

	/**
	 * @param alamcenID the alamcenID to set
	 */
	public void setAlamcenID(Integer alamcenID) {
		this.alamcenID = alamcenID;
	}

	/**
	 * @return the usuarioID
	 */
	public String getUsuarioID() {
		return usuarioID;
	}

	/**
	 * @param usuarioID the usuarioID to set
	 */
	public void setUsuarioID(String usuarioID) {
		this.usuarioID = usuarioID;
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
