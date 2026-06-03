package com.green.mx.model.response;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -1260555267372256951L;

	private Long clienteID;
	
    private String cveCliente;
    
    private String nombre;
    
    private String aPaterno;
    
    private String aMaterno;
    
    private String fechaNac;
    
    private String telefono;
    
    private String email;
    
    private String detalle;
    
    private Boolean estatus;

	/**
	 * @return the clienteID
	 */
	public Long getClienteID() {
		return clienteID;
	}

	/**
	 * @param clienteID the clienteID to set
	 */
	public void setClienteID(Long clienteID) {
		this.clienteID = clienteID;
	}

	/**
	 * @return the cveCliente
	 */
	public String getCveCliente() {
		return cveCliente;
	}

	/**
	 * @param cveCliente the cveCliente to set
	 */
	public void setCveCliente(String cveCliente) {
		this.cveCliente = cveCliente;
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
	 * @return the aPaterno
	 */
	public String getaPaterno() {
		return aPaterno;
	}

	/**
	 * @param aPaterno the aPaterno to set
	 */
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	/**
	 * @return the aMaterno
	 */
	public String getaMaterno() {
		return aMaterno;
	}

	/**
	 * @param aMaterno the aMaterno to set
	 */
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
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
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
    
    

}
