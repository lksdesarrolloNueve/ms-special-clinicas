package com.green.mx.model.request;

import java.io.Serializable;

public class RequestPermisos implements Serializable{
	
	/**
	 * Serial ID de la clase
	 */
	private static final long serialVersionUID = -4659271876407893828L;

	private String[] menus;
	
	private String rolID;

	/**
	 * @return the menus
	 */
	public String[] getMenus() {
		return menus;
	}

	/**
	 * @param menus the menus to set
	 */
	public void setMenus(String[] menus) {
		this.menus = menus;
	}

	/**
	 * @return the rolID
	 */
	public String getRolID() {
		return rolID;
	}

	/**
	 * @param rolID the rolID to set
	 */
	public void setRolID(String rolID) {
		this.rolID = rolID;
	}
	
	
	

}
