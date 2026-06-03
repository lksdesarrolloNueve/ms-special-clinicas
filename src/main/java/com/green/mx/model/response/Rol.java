package com.green.mx.model.response;

import java.io.Serializable;

public class Rol implements Serializable{
	
	/**
	 * serial id de la clase
	 */
	private static final long serialVersionUID = -7432413743019007362L;

	private Integer rolID;
	
    private String nombre;


    private Boolean estatus;


	/**
	 * @return the rolID
	 */
	public Integer getRolID() {
		return rolID;
	}


	/**
	 * @param rolID the rolID to set
	 */
	public void setRolID(Integer rolID) {
		this.rolID = rolID;
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
