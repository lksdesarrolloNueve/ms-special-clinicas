package com.green.mx.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.green.mx.dao.IDinamicoDAO;
import com.green.mx.mapper.ResponseJsonMapper;

@Repository
public class ImplDinamicoDAO implements IDinamicoDAO{
	
	/**
	 * Instancia de JDBCTemplate para el acceso a la BD
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Metodo para ejecutar querys de forma dinamica en 
	 * Formato Generico JSON 
	 * @param query - Query a consultar
	 * @param params - Parametros a filtrar
	 * @return {@link String} JSON generico
	 */
	@Override
	public String execQuery(String query, Object[] params) {
		return jdbcTemplate.queryForObject(query, 
				new ResponseJsonMapper(), params);
	}

}
