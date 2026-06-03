package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestPermisos;
import com.green.mx.model.request.RequestUsuario;
import com.green.mx.model.response.Menu;
import com.green.mx.model.response.Rol;
import com.green.mx.service.IPermisosService;

@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class PermisosController {


	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IPermisosService service;

	/**
	 * API para retornar una lista de Roles
	 * @param accion - 1. Todos los roles, 2. Rol Activos, 3. Rol inactivos
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud con lista
	 */
	@GetMapping(path ="/getRoles/{accion}",produces = JSON_PROD_CONS)
	public Estatus<Rol> getRoles(@PathVariable(value ="accion")Integer accion){
		return service.getRoles(accion);
	}

	/**
	 * API para permitir crear, modificar, baja de roles
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Categoria>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudRol",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Rol> crudRol(@RequestBody Request request){
		return service.crudRol(request);
	}

	/**
	 * API para retornar una lista de Menus
	 * @param accion - 1. Todos los Menus, 2. Menus Activos, 3. Menus inactivos
	 * @return {@link Estatus<Menu>} - Estado de la solicitud con lista
	 */
	@GetMapping(path ="/getMenus/{rolID}",produces = JSON_PROD_CONS)
	public Estatus<Menu> getMenus(@PathVariable(value ="rolID")String rolID){
		return service.getMenus(rolID);
	}

	/**
	 * API para permitir registrar permisos por rol
	 * @param request - Información con los datos a guardar
	 * @return {@link Estatus<Menu>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudPermisos",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Menu> crudPermisos(@RequestBody RequestPermisos request){
		return service.crudPermisos(request);
	}

	/**
	 * API para permitir crear, modificar, baja de usuarios
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Usuario>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudPermisosUsuario",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Menu> crudPermisosUsuario(@RequestBody RequestUsuario request){
		return service.crudPermisosUsuario(request);
	}

	/**
	 * API para obtener los permisos por Usuario
	 * @param usuarioID - Usuario a Filtrar / Usuario logueado
	 * @return {@link String} - Informacion en formato JSON con los datos del Usuario
	 */
	@GetMapping(path="/getPermisosUsuario/{usuarioID}", produces = JSON_PROD_CONS)
	public String getPermisosUsuario(@PathVariable(value ="usuarioID")String usuarioID) {
		return service.getPermisosUsuario(usuarioID);
	}

}
