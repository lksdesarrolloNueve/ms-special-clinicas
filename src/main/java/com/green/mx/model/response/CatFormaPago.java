package com.green.mx.model.response;

import java.io.Serializable;

public class CatFormaPago implements Serializable{

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;


	/**
	 * Id forma pago
	 */
	private Integer formaPagoId;

	/**
	 * Clave forma pago
	 */
	private String claveFPago;

	/**
	 * Descripcion forma pago
	 */
	private String descripcion;

	/**
	 * Iconco
	 */
	private String icono;

	/**
	 * Estatus forma pago
	 */
	private boolean estatus;

	/**
	 * @return the formaPagoId
	 */
	public Integer getFormaPagoId() {
		return formaPagoId;
	}

	/**
	 * @param formaPagoId the formaPagoId to set
	 */
	public void setFormaPagoId(Integer formaPagoId) {
		this.formaPagoId = formaPagoId;
	}

	/**
	 * @return the claveFPago
	 */
	public String getClaveFPago() {
		return claveFPago;
	}

	/**
	 * @param claveFPago the claveFPago to set
	 */
	public void setClaveFPago(String claveFPago) {
		this.claveFPago = claveFPago;
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
	 * @return the icono
	 */
	public String getIcono() {
		return icono;
	}

	/**
	 * @param icono the icono to set
	 */
	public void setIcono(String icono) {
		this.icono = icono;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}




}
