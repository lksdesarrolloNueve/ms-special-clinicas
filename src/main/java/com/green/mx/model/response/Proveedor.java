package com.green.mx.model.response;

import java.io.Serializable;

public class Proveedor implements Serializable{
	
	
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -2994596043736747097L;

	private Integer proveedorID;
	
    private String nombre;
    
    private String telefono;
    
    private String email;
    
    private String direccion;
    
    private Integer cp;
    
    private String fechaAlta;
    
    private Boolean estatus;
    
    private String cveProveedor;

	/**
	 * @return the proveedorID
	 */
	public Integer getProveedorID() {
		return proveedorID;
	}

	/**
	 * @param proveedorID the proveedorID to set
	 */
	public void setProveedorID(Integer proveedorID) {
		this.proveedorID = proveedorID;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the cp
	 */
	public Integer getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(Integer cp) {
		this.cp = cp;
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
	 * @return the cveProveedor
	 */
	public String getCveProveedor() {
		return cveProveedor;
	}

	/**
	 * @param cveProveedor the cveProveedor to set
	 */
	public void setCveProveedor(String cveProveedor) {
		this.cveProveedor = cveProveedor;
	}
    
    

}
