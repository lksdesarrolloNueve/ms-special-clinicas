package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.CategoriaMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Categoria;
import com.green.mx.service.ICategoriaService;

@Service
public class ImplCategoriaService implements ICategoriaService{

	/**
	 * QUERY PARA OBTENER LOS Categorias DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_categorias(?);";

	/**
	 * Query para CRUDS de Categorias
	 */
	private String queryCRUDCategoria = "SELECT * FROM almacen.crud_categoria(?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Categoria> daoCategoria;

	/**
	 * Metodo para retornar una lista de Categorias
	 * @param accion - 1. Todos los Categoria, 2. Categoria Activos, 3. Categoria inactivos
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Categoria> getCategorias(Integer accion) {
		return daoCategoria.getList(queryGetList, new Object[] {accion}, new CategoriaMapper());
	}

	/**
	 * Metodo para permitir crear, modificar, baja de Categorias
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Categoria> crudCategoria(Request request) {
		return daoCategoria.crud(queryCRUDCategoria, new Object[] {request.getDatos(), request.getAccion()});
	}

}
