package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ProveedorMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.RequestProveedor;
import com.green.mx.model.response.Proveedor;
import com.green.mx.service.IProveedorService;

@Service
public class ImplProveedorService implements IProveedorService{

	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_proveedores(?);";

	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDProveedor = "SELECT * FROM almacen.crud_proveedor(?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Proveedor> daoProveedor;

	/**
	 * Metodo para retornar una lista de Proveedores
	 * @param accion - 1. Todos los Proveedores, 2. Proveedores Activos, 3. Proveedores inactivos
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Proveedor> getProveedores(Integer accion) {
		return daoProveedor.getList(queryGetList, new Object[] {accion}, new ProveedorMapper());
	}


	/**
	 * Que para permitir crear, modificar, baja de Proveedores
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Proveedor>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Proveedor> crudProveedor(RequestProveedor request) {
		return daoProveedor.crud(queryCRUDProveedor, new Object[] {request.getDatos(), request.getAccion()});
	}

}
