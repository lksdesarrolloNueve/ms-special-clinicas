package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.mx.dao.IDinamicoDAO;
import com.green.mx.model.Request;
import com.green.mx.model.RequestTenant;
import com.green.mx.service.IDinamicoService;

@Service
public class ImplDinamicoService implements IDinamicoService{

	@Autowired
	private IDinamicoDAO dao;

	/**
	 * Firma que permite ejecutar consultas dinamicas
	 * @param request - Información a Registrar
	 * @param query - Query  a ejecutar
	 * @return {@link String} - Info de la Función
	 */
	@Override
	public String execQueryDinamico(Request request,
			String query) {
		var resultado = "";
		try {
			var json =
					new ObjectMapper().writeValueAsString
					(request.getDatos());

			resultado = dao.execQuery(query,
					new Object[]{ json, request.getAccion() });

		} catch (JsonProcessingException e) {
			resultado ="{\"codigo\":5,\"mensaje\":\""+e.getMessage()+"\"}";
		}

		return resultado;
	}

	@Override
	public String execQueryDinamicoTenant(RequestTenant request, String query) {
		var resultado = "";
		try {
			var json =
					new ObjectMapper().writeValueAsString
					(request.getDatos());

			resultado = dao.execQuery(query,
					new Object[]{ json, request.getTenantID(),request.getAccion() });

		} catch (JsonProcessingException e) {
			resultado ="{\"codigo\":5,\"mensaje\":\""+e.getMessage()+"\"}";
		}

		return resultado;
	}



}
