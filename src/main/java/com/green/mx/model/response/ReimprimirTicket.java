/**
 *
 */
package com.green.mx.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author lksbaassadecv
 * @description Información para reimrimir ticket del dia
 *
 */
public class ReimprimirTicket implements Serializable{

	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = -4639744898634522791L;

	private String cajero;
	private String cliente;
	private String claveVenta;
	private BigDecimal descuento;
	private String direccion;
	private String almacen;
	private String fechaHora;
	private String formasPago;
	private String productos;
	private String apartados;
	private BigDecimal montoResta;

	/**
	 * @return the cajero
	 */
	public String getCajero() {
		return cajero;
	}
	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(String cajero) {
		this.cajero = cajero;
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
	 * @return the claveVenta
	 */
	public String getClaveVenta() {
		return claveVenta;
	}
	/**
	 * @param claveVenta the claveVenta to set
	 */
	public void setClaveVenta(String claveVenta) {
		this.claveVenta = claveVenta;
	}
	/**
	 * @return the descuento
	 */
	public BigDecimal getDescuento() {
		return descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	 * @return the formasPago
	 */
	public String getFormasPago() {
		return formasPago;
	}
	/**
	 * @param formasPago the formasPago to set
	 */
	public void setFormasPago(String formasPago) {
		this.formasPago = formasPago;
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
	/**
	 * @return the apartados
	 */
	public String getApartados() {
		return apartados;
	}
	/**
	 * @param apartados the apartados to set
	 */
	public void setApartados(String apartados) {
		this.apartados = apartados;
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





}
