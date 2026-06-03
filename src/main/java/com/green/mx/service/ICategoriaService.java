package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Categoria;

public interface ICategoriaService {

	/**
	 * Que para retornar una lista de Categorias
	 * @param accion - 1. Todos los Categoria, 2. Categoria Activos, 3. Categoria inactivos
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud con lista
	 */
	Estatus<Categoria> getCategorias(Integer accion);

	/**
	 * Que para permitir crear, modificar, baja de Categorias
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud
	 */
	Estatus<Categoria> crudCategoria(Request request);

}
