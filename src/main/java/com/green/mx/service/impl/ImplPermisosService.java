package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.MenuMapper;
import com.green.mx.mapper.RolMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestPermisos;
import com.green.mx.model.request.RequestUsuario;
import com.green.mx.model.response.Menu;
import com.green.mx.model.response.Rol;
import com.green.mx.service.IPermisosService;

@Service
public class ImplPermisosService implements IPermisosService{
	
	/**
	 * QUERY PARA OBTENER LOS Roles DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_roles(?);";
	
	/**
	 * Query para CRUDS de Roles
	 */
	private String queryCRUDRol = "SELECT * FROM almacen.crud_rol(?,?)";
	
	/**
	 * QUERY PARA OBTENER LOS Roles DEPENDIENDO DE LA ACCION
	 */
	private String queryGetListMenus ="SELECT * FROM almacen.get_menus(?);";
	
	/**
	 * Query para registrar los permisos de usuario
	 */
	private String queryCRUDPermisos = "SELECT * FROM almacen.crud_permisos(?,?)";
	
	
	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDPermisosUsuario = "SELECT * FROM almacen.crud_permisos_usuario(?,?,?)";
	
	/**
	 * Query para obtener los permisos de usuario
	 */
	private String queryGetPermisosUsuario = "SELECT * FROM almacen.get_permisos_usuario(?)";
	
	/**
	 * INSTANCIA DE ACCESO A DATOS a ROLES
	 */
	@Autowired
	private IGestionDAO<Rol> daoRol;
	
	
	/**
	 * INSTANCIA DE ACCESO A DATOS A MENUS
	 */
	@Autowired
	private IGestionDAO<Menu> daoMenu;
	
	
	/**
	 * Metodo para retornar una lista de Roles
	 * @param accion - 1. Todos los Categoria, 2. Rol Activos, 3. Rol inactivos
	 * @return {@link Estatus<Rol>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Rol> getRoles(Integer accion) {
		return daoRol.getList(queryGetList, new Object[] {accion}, new RolMapper());
	}

	/**
	 * Metodo para permitir crear, modificar, baja de Roles
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Rol>} - Estado de la solicitud 
	 */
	@Override
	public Estatus<Rol> crudRol(Request request) {
		return daoRol.crud(queryCRUDRol, new Object[] {request.getDatos(), request.getAccion()});
	}

	/**
	 * Metodo para retornar una lista de Menus
	 * @param rolID - Rol ID a filtrar
	 * @return {@link Estatus<Menu>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Menu> getMenus(String rolID) {
		return daoMenu.getList(queryGetListMenus, new Object[] {rolID}, new MenuMapper());
	}

	/**
	 * Metodo para permitir registrar permisos por rol
	 * @param request - Información con los datos a guardar
	 * @return {@link Estatus<Menu>} - Estado de la solicitud 
	 */
	@Override
	public Estatus<Menu> crudPermisos(RequestPermisos request) {
		return daoMenu.crud(queryCRUDPermisos, new Object[] {request.getMenus(), request.getRolID()});
	}

	/**
	 * Metodo para permitir crear, modificar, baja de usuarios
	 * @param request - Información con los datos a guardar, con accion a realizar 
	 * @return {@link Estatus<Usuario>} - Estado de la solicitud 
	 */
	@Override
	public Estatus<Menu> crudPermisosUsuario(RequestUsuario request) {
		return daoMenu.crud(queryCRUDPermisosUsuario,  new Object[] {request.getDatos(), request.getAlmacenes(),request.getAccion()});
	}

	/**
	 * Metodo para obtener los permisos por Usuario
	 * @param usuarioID - Usuario a Filtrar / Usuario logueado
	 * @return {@link String} - Informacion en formato JSON con los datos del Usuario
	 */
	@Override
	public String getPermisosUsuario(String usuarioID) {
		return daoMenu.getJSON(queryGetPermisosUsuario, new Object[] {usuarioID});
	}

}
