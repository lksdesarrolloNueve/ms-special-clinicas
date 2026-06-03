package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.model.request.Request;
import com.green.mx.service.IEmpresaService;

@Service
public class ImplEmpresaService implements IEmpresaService{

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<String> daoEmpresas;

	/**
	 * Query para CRUDS de Empresas
	 */
	private String queryCRUDEmpresa = "SELECT * FROM special.crud_empresa(?,?)";

	@Override
	public String crudEmpresa(Request request) {
		return daoEmpresas.getJSON(queryCRUDEmpresa, new Object[] {request.getDatos(), request.getAccion()});
	}

}
