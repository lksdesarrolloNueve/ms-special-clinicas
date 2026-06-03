package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class TotalOperacion implements Serializable{
	
	/**
	 * Sereial Id de la clase
	 */
	private static final long serialVersionUID = -7286959023144812762L;

	private String cveOperacion;
	
	private String descripcion;
	
	private BigDecimal total;

	/**
	 * @return the cveOperacion
	 */
	public String getCveOperacion() {
		return cveOperacion;
	}

	/**
	 * @param cveOperacion the cveOperacion to set
	 */
	public void setCveOperacion(String cveOperacion) {
		this.cveOperacion = cveOperacion;
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
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	

}
