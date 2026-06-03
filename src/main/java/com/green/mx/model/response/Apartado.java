package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class Apartado implements Serializable {
	
	/**
	 * Serial Id de la clase
	 */
	private static final long serialVersionUID = 4780739045811741562L;
	
	private Long idApartado;
	private String cveApartado;
	private String almacen;
	private String cliente;
	private String usuario;
	private String fecha;
	private String hora;
	private String fechaVence;
	private BigDecimal montoTotal;
	private BigDecimal montoResta;
	private String estatus;
	private String productos;

	/**
	 * @return the idApartado
	 */
	public Long getIdApartado() {
		return idApartado;
	}

	/**
	 * @param idApartado the idApartado to set
	 */
	public void setIdApartado(Long idApartado) {
		this.idApartado = idApartado;
	}

	/**
	 * @return the cveApartado
	 */
	public String getCveApartado() {
		return cveApartado;
	}

	/**
	 * @param cveApartado the cveApartado to set
	 */
	public void setCveApartado(String cveApartado) {
		this.cveApartado = cveApartado;
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
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the fechaVence
	 */
	public String getFechaVence() {
		return fechaVence;
	}

	/**
	 * @param fechaVence the fechaVence to set
	 */
	public void setFechaVence(String fechaVence) {
		this.fechaVence = fechaVence;
	}

	/**
	 * @return the montoTotal
	 */
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	/**
	 * @param montoTotal the montoTotal to set
	 */
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	/**
	 * @return the montoResta
	 */
	public BigDecimal getMontoResta() {
		return montoResta;
	}

	/**
	 * @param montoResta the montoResta to set
	 */
	public void setMontoResta(BigDecimal montoResta) {
		this.montoResta = montoResta;
	}

	/**
	 * @return the estatus
	 */
	public String getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the productos
	 */
	public String getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(String productos) {
		this.productos = productos;
	}
	
	
	

	
	
}
