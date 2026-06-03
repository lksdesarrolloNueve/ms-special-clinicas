package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class MovSesionCaja implements Serializable {

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;
	
	/**
	 * id
	 */
	private Integer idFPago;
	
	/**
	 * Cve forma pago
	 */
	private String cveFPago;
	
	/**
	 * Descripcion forma pago
	 */
	private String descripcion;
	
	/**
	 * Saldo
	 */
	private BigDecimal monto;

	/**
	 * @return the idFPago
	 */
	public Integer getIdFPago() {
		return idFPago;
	}

	/**
	 * @param idFPago the idFPago to set
	 */
	public void setIdFPago(Integer idFPago) {
		this.idFPago = idFPago;
	}

	/**
	 * @return the cveFPago
	 */
	public String getCveFPago() {
		return cveFPago;
	}

	/**
	 * @param cveFPago the cveFPago to set
	 */
	public void setCveFPago(String cveFPago) {
		this.cveFPago = cveFPago;
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
	 * @return the monto
	 */
	public BigDecimal getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
}
