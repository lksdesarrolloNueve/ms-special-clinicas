package com.green.mx.model.response;

import java.io.Serializable;

public class Producto implements Serializable{

    /**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = -6120582152172873441L;

	private Integer productoID;

    private String nombre;

    private String descripcion;

    private String codigo;

    private String fechaAlta;

    private Boolean estatus;

    private String categoria;

    private String tipoProducto;

    private DetalleProducto detalle;


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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the estatus
	 */
	public Boolean getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	/**
	 * @return the tipoProducto
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	/**
	 * @param tipoProducto the tipoProducto to set
	 */
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	/**
	 * @return the detalle
	 */
	public DetalleProducto getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(DetalleProducto detalle) {
		this.detalle = detalle;
	}




}
