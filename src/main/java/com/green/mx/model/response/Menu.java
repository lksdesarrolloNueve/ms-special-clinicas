package com.green.mx.model.response;

import java.io.Serializable;

public class Menu implements Serializable{

	/**
	 * Serial Id
	 */
	private static final long serialVersionUID = 1981814499895756510L;

	private Integer menuID;

    private String titulo;

    private String descripcion;

    private String icon;

    private String pathurl;

    private Boolean estatus;

	/**
	 * @return the menuID
	 */
	public Integer getMenuID() {
		return menuID;
	}

	/**
	 * @param menuID the menuID to set
	 */
	public void setMenuID(Integer menuID) {
		this.menuID = menuID;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the pathurl
	 */
	public String getPathurl() {
		return pathurl;
	}

	/**
	 * @param pathurl the pathurl to set
	 */
	public void setPathurl(String pathurl) {
		this.pathurl = pathurl;
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
