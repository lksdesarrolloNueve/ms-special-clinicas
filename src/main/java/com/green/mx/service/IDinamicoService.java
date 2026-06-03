package com.green.mx.service;

import com.green.mx.model.Request;
import com.green.mx.model.RequestTenant;

public interface IDinamicoService {
	
	/**
	 * Firma que permite ejecutar consultas dinamicas
	 * @param request - Información a Registrar
	 * @param query - Query  a ejecutar
	 * @return {@link String} - Info de la Función
	 */
	String execQueryDinamico(Request request, String query);
	
	/**
	 * Firma que permite ejecutar consultas dinamicas
	 * @param request - Información a Registrar
	 * @param query - Query  a ejecutar
	 * @return {@link String} - Info de la Función
	 */
	String execQueryDinamicoTenant(RequestTenant request, String query);

}
