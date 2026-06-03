package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class VtaFPSesion implements Serializable{

	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = 4780739045811741562L;

	private Long ventaID;

	private String cveVenta;

	private String concepto;

	private String operacion;

	private String descripcion;

	private String fechaHora;

	private String cveFormaPag;

	private String descFormaPag;

	private BigDecimal monto;

	/**
	 * @return the ventaID
	 */
	public Long getVentaID() {
		return ventaID;
	}

	/**
	 * @param ventaID the ventaID to set
	 */
	public void setVentaID(Long ventaID) {
		this.ventaID = ventaID;
	}

	/**
	 * @return the cveVenta
	 */
	public String getCveVenta() {
		return cveVenta;
	}

	/**
	 * @param cveVenta the cveVenta to set
	 */
	public void setCveVenta(String cveVenta) {
		this.cveVenta = cveVenta;
	}

	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * @return the operacion
	 */
	public String getOperacion() {
		return operacion;
	}

	/**
	 * @param operacion the operacion to set
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
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
	 * @return the fechaHora
	 */
	public String getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * @return the cveFormaPag
	 */
	public String getCveFormaPag() {
		return cveFormaPag;
	}

	/**
	 * @param cveFormaPag the cveFormaPag to set
	 */
	public void setCveFormaPag(String cveFormaPag) {
		this.cveFormaPag = cveFormaPag;
	}

	/**
	 * @return the descFormaPag
	 */
	public String getDescFormaPag() {
		return descFormaPag;
	}

	/**
	 * @param descFormaPag the descFormaPag to set
	 */
	public void setDescFormaPag(String descFormaPag) {
		this.descFormaPag = descFormaPag;
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
