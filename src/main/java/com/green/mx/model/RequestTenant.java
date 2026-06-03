package com.green.mx.model;

import java.util.UUID;

public class RequestTenant {


	/**
	 * Json para CRUD
	 */
	private Object datos;

	private UUID tenantID;


	/**
	 * Accion a realizar 1.- Inserta, 2. Actualiza
	 */
	private Integer accion;

	/**
	 * @return the datos
	 */
	public Object getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(Object datos) {
		this.datos = datos;
	}





	public UUID getTenantID() {
		return tenantID;
	}

	public void setTenantID(UUID tenantID) {
		this.tenantID = tenantID;
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
