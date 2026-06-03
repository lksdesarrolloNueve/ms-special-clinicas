package com.green.mx.model.response;


import com.green.mx.model.DetalleCaja;

public class SesionCaja {
	
	private Long idSesionCaja;
	
	private Boolean abierta;
	
	private String idUsuario;
	
	private String usuario;

	private Integer idCaja;
	
	private String cveCaja;
	
	private String descCaja;
	
	private DetalleCaja detalleCaja;

	/**
	 * @return the idSesionCaja
	 */
	public Long getIdSesionCaja() {
		return idSesionCaja;
	}

	/**
	 * @param idSesionCaja the idSesionCaja to set
	 */
	public void setIdSesionCaja(Long idSesionCaja) {
		this.idSesionCaja = idSesionCaja;
	}

	/**
	 * @return the abierta
	 */
	public Boolean getAbierta() {
		return abierta;
	}

	/**
	 * @param abierta the abierta to set
	 */
	public void setAbierta(Boolean abierta) {
		this.abierta = abierta;
	}

	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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
	 * @return the idCaja
	 */
	public Integer getIdCaja() {
		return idCaja;
	}

	/**
	 * @param idCaja the idCaja to set
	 */
	public void setIdCaja(Integer idCaja) {
		this.idCaja = idCaja;
	}

	/**
	 * @return the cveCaja
	 */
	public String getCveCaja() {
		return cveCaja;
	}

	/**
	 * @param cveCaja the cveCaja to set
	 */
	public void setCveCaja(String cveCaja) {
		this.cveCaja = cveCaja;
	}

	/**
	 * @return the descCaja
	 */
	public String getDescCaja() {
		return descCaja;
	}

	/**
	 * @param descCaja the descCaja to set
	 */
	public void setDescCaja(String descCaja) {
		this.descCaja = descCaja;
	}

	/**
	 * @return the detalleCaja
	 */
	public DetalleCaja getDetalleCaja() {
		return detalleCaja;
	}

	/**
	 * @param detalleCaja the detalleCaja to set
	 */
	public void setDetalleCaja(DetalleCaja detalleCaja) {
		this.detalleCaja = detalleCaja;
	}
	
	
	

}
