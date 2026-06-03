package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class Caja implements Serializable {

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -7835255327679219002L;

	/**
	 * Id de la caja
	 */
	private Integer cajaId;

	/**
	 * Clave de la caja
	 */
	private String cveCaja;

	/**
	 * Descripcion de la caja
	 */
	private String descripcion;

	/**
	 * JSON objeto almacen
	 */
	private String almacen;

	/**
	 * Saldo cierre caja
	 */
	private BigDecimal saldoCierre;

	/**
	 * Estatus caja
	 */
	private boolean estatus;

	/**
	 * @return the cajaId
	 */
	public Integer getCajaId() {
		return cajaId;
	}

	/**
	 * @param cajaId the cajaId to set
	 */
	public void setCajaId(Integer cajaId) {
		this.cajaId = cajaId;
	}

	/**
	 * @return the cveCaja
	 */
	public String getCveCaja() {
		return cveCaja;
	}

	/**
	 * @param cveCaja the cveCaja to set
	 */
	public void setCveCaja(String cveCaja) {
		this.cveCaja = cveCaja;
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
	 * @return the saldoCierre
	 */
	public BigDecimal getSaldoCierre() {
		return saldoCierre;
	}

	/**
	 * @param saldoCierre the saldoCierre to set
	 */
	public void setSaldoCierre(BigDecimal saldoCierre) {
		this.saldoCierre = saldoCierre;
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
