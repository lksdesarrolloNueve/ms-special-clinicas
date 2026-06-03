package com.green.mx.model.response;

import java.io.Serializable;

public class Stock implements Serializable{
	
	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = 4247219594051178031L;

	private Integer productoID;
	
	private String producto;
	
	private Long totalStock;
	
	private Integer minStock;
	
	private Integer maxStock;
	
	private String almacen;

	/**
	 * @return the productoID
	 */
	public Integer getProductoID() {
		return productoID;
	}

	/**
	 * @param productoID the productoID to set
	 */
	public void setProductoID(Integer productoID) {
		this.productoID = productoID;
	}

	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return the totalStock
	 */
	public Long getTotalStock() {
		return totalStock;
	}

	/**
	 * @param totalStock the totalStock to set
	 */
	public void setTotalStock(Long totalStock) {
		this.totalStock = totalStock;
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
	
	

}
