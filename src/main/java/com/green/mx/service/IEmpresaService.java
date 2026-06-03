package com.green.mx.service;


import com.green.mx.model.request.Request;

public interface IEmpresaService {

	/**
	 * Que  para crear, modificar, baja de empresas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link String} - Json con la informacion
	 */
	String crudEmpresa(Request request);

}
