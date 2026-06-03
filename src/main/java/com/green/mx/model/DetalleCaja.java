package com.green.mx.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DetalleCaja implements Serializable{


	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = 962752269532825722L;

	private String fApertura;

	private String fCierre;

	private String comentarioA;

	private String comentarioC;

	private BigDecimal saldoInicialSistema;

	private BigDecimal saldoInicialCajero;

	private BigDecimal saldoFinalSistema;

	private BigDecimal saldoFinalCajero;

	private BigDecimal diferencia;

	/**
	 * @return the fApertura
	 */
	public String getfApertura() {
		return fApertura;
	}

	/**
	 * @param fApertura the fApertura to set
	 */
	public void setfApertura(String fApertura) {
		this.fApertura = fApertura;
	}

	/**
	 * @return the fCierre
	 */
	public String getfCierre() {
		return fCierre;
	}

	/**
	 * @param fCierre the fCierre to set
	 */
	public void setfCierre(String fCierre) {
		this.fCierre = fCierre;
	}

	/**
	 * @return the comentarioA
	 */
	public String getComentarioA() {
		return comentarioA;
	}

	/**
	 * @param comentarioA the comentarioA to set
	 */
	public void setComentarioA(String comentarioA) {
		this.comentarioA = comentarioA;
	}

	/**
	 * @return the comentarioC
	 */
	public String getComentarioC() {
		return comentarioC;
	}

	/**
	 * @param comentarioC the comentarioC to set
	 */
	public void setComentarioC(String comentarioC) {
		this.comentarioC = comentarioC;
	}

	/**
	 * @return the saldoInicialSistema
	 */
	public BigDecimal getSaldoInicialSistema() {
		return saldoInicialSistema;
	}

	/**
	 * @param saldoInicialSistema the saldoInicialSistema to set
	 */
	public void setSaldoInicialSistema(BigDecimal saldoInicialSistema) {
		this.saldoInicialSistema = saldoInicialSistema;
	}

	/**
	 * @return the saldoInicialCajero
	 */
	public BigDecimal getSaldoInicialCajero() {
		return saldoInicialCajero;
	}

	/**
	 * @param saldoInicialCajero the saldoInicialCajero to set
	 */
	public void setSaldoInicialCajero(BigDecimal saldoInicialCajero) {
		this.saldoInicialCajero = saldoInicialCajero;
	}

	/**
	 * @return the saldoFinalSistema
	 */
	public BigDecimal getSaldoFinalSistema() {
		return saldoFinalSistema;
	}

	/**
	 * @param saldoFinalSistema the saldoFinalSistema to set
	 */
	public void setSaldoFinalSistema(BigDecimal saldoFinalSistema) {
		this.saldoFinalSistema = saldoFinalSistema;
	}

	/**
	 * @return the saldoFinalCajero
	 */
	public BigDecimal getSaldoFinalCajero() {
		return saldoFinalCajero;
	}

	/**
	 * @param saldoFinalCajero the saldoFinalCajero to set
	 */
	public void setSaldoFinalCajero(BigDecimal saldoFinalCajero) {
		this.saldoFinalCajero = saldoFinalCajero;
	}

	/**
	 * @return the diferencia
	 */
	public BigDecimal getDiferencia() {
		return diferencia;
	}

	/**
	 * @param diferencia the diferencia to set
	 */
	public void setDiferencia(BigDecimal diferencia) {
		this.diferencia = diferencia;
	}



}
