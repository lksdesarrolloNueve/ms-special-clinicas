package com.green.mx.model.request;

import java.io.Serializable;

public class RequestGetPaginado implements Serializable{
	
	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = 2278774856049502846L;

	private String[] filtros;
	
	private Integer accion;

	private Integer noPagina;
	
	private Integer tamPagina;

	/**
	 * @return the filtros
	 */
	public String[] getFiltros() {
		return filtros;
	}

	/**
	 * @param filtros the filtros to set
	 */
	public void setFiltros(String[] filtros) {
		this.filtros = filtros;
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

	/**
	 * @return the noPagina
	 */
	public Integer getNoPagina() {
		return noPagina;
	}

	/**
	 * @param noPagina the noPagina to set
	 */
	public void setNoPagina(Integer noPagina) {
		this.noPagina = noPagina;
	}

	/**
	 * @return the tamPagina
	 */
	public Integer getTamPagina() {
		return tamPagina;
	}

	/**
	 * @param tamPagina the tamPagina to set
	 */
	public void setTamPagina(Integer tamPagina) {
		this.tamPagina = tamPagina;
	}
	
	
	

}
