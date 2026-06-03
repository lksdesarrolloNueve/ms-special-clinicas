package com.green.mx.service;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestPermisos;
import com.green.mx.model.request.RequestUsuario;
import com.green.mx.model.response.Menu;
import com.green.mx.model.response.Rol;

public interface IPermisosService {

	/**
	 * Que para retornar una lista de Roles
	 * @param accion - 1. Todos los Rol, 2. Rol Activos, 3. Rol inactivos
	 * @return {@link Estatus<Rol>} - Estado de la solicitud con lista
	 */
	Estatus<Rol> getRoles(Integer accion);

	/**
	 * Que para permitir crear, modificar, baja de Roles
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Rol>} - Estado de la solicitud
	 */
	Estatus<Rol> crudRol(Request request);


	/**
	 * Que para retornar una lista de Menus
	 * @param rolID - Rol ID a filtrar
	 * @return {@link Estatus<Menu>} - Estado de la solicitud con lista
	 */
	Estatus<Menu> getMenus(String rolID);


	/**
	 * Que para permitir registrar permisos por rol
	 * @param request - Información con los datos a guardar
	 * @return {@link Estatus<Menu>} - Estado de la solicitud
	 */
	Estatus<Menu> crudPermisos(RequestPermisos request);


	/**
	 * Que para permitir crear, modificar, baja de usuarios
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Usuario>} - Estado de la solicitud
	 */
	Estatus<Menu> crudPermisosUsuario(RequestUsuario request);


	/**
	 * Que para obtener los permisos por Usuario
	 * @param usuarioID - Usuario a Filtrar / Usuario logueado
	 * @return {@link String} - Informacion en formato JSON con los datos del Usuario
	 */
	String getPermisosUsuario(String usuarioID);

}
