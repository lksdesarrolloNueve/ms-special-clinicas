package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class DetalleProducto implements Serializable{
	
	
	/**
	 * Serial Id
	 */
	private static final long serialVersionUID = 19995226435130705L;

	private Integer stock;
	
	private Integer minStock;
	
	private Integer maxStock;
	
	private Boolean iva;
    
	private Boolean ptv;
    
    private BigDecimal precioCosto;
    
    private BigDecimal precioVenta;
    
    private Boolean bascula;

	/**
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * @return the minStock
	 */
	public Integer getMinStock() {
		return minStock;
	}

	/**
	 * @param minStock the minStock to set
	 */
	public void setMinStock(Integer minStock) {
		this.minStock = minStock;
	}

	/**
	 * @return the maxStock
	 */
	public Integer getMaxStock() {
		return maxStock;
	}

	/**
	 * @param maxStock the maxStock to set
	 */
	public void setMaxStock(Integer maxStock) {
		this.maxStock = maxStock;
	}

	/**
	 * @return the iva
	 */
	public Boolean getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(Boolean iva) {
		this.iva = iva;
	}

	/**
	 * @return the ptv
	 */
	public Boolean getPtv() {
		return ptv;
	}

	/**
	 * @param ptv the ptv to set
	 */
	public void setPtv(Boolean ptv) {
		this.ptv = ptv;
	}

	/**
	 * @return the precioCosto
	 */
	public BigDecimal getPrecioCosto() {
		return precioCosto;
	}

	/**
	 * @param precioCosto the precioCosto to set
	 */
	public void setPrecioCosto(BigDecimal precioCosto) {
		this.precioCosto = precioCosto;
	}

	/**
	 * @return the precioVenta
	 */
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the bascula
	 */
	public Boolean getBascula() {
		return bascula;
	}

	/**
	 * @param bascula the bascula to set
	 */
	public void setBascula(Boolean bascula) {
		this.bascula = bascula;
	}
    
    
    
	
	

}
