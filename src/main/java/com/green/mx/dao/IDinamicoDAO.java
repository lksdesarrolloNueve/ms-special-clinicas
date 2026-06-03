package com.green.mx.dao;

public interface IDinamicoDAO {

	/**
	 * Que para ejecutar querys de forma dinamica en Formato Generico JSON
	 * @param query - Query a consultar
	 * @param params - Parametros a filtrar
	 * @return {@link String} JSON generico
	 */
	String execQuery(String query, Object[] params);

}
