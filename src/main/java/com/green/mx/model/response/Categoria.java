package com.green.mx.model.response;

import java.io.Serializable;

public class Categoria implements Serializable{

	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = 3529663434971857887L;

	private Integer categoriaID;

    private String nombre;

    private String descripcion;

    private Boolean estatus;

    private String cveCategoria;

	/**
	 * @return the categoriaID
	 */
	public Integer getCategoriaID() {
		return categoriaID;
	}

	/**
	 * @param categoriaID the categoriaID to set
	 */
	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
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

	/**
	 * @return the cveCategoria
	 */
	public String getCveCategoria() {
		return cveCategoria;
	}

	/**
	 * @param cveCategoria the cveCategoria to set
	 */
	public void setCveCategoria(String cveCategoria) {
		this.cveCategoria = cveCategoria;
	}


}
