package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ClienteMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.RequestCliente;
import com.green.mx.model.response.Cliente;
import com.green.mx.service.IClienteService;

@Service
public class ImplClienteService implements IClienteService{

	/**
	 * QUERY PARA OBTENER LOS CLIENTES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_clientes(?);";

	/**
	 * Query para CRUDS de Clientes
	 */
	private String queryCRUDCliente = "SELECT * FROM almacen.crud_cliente(?,?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Cliente> daoCliente;


	/**
	 * Metodo que retorna una lista de clientes
	 *
	 * @param accion - 1. Todos los clientes, 2. Clientees Activos, 3. Clientees    inactivos
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Cliente> getClientes(Integer accion){
		return daoCliente.getList(queryGetList, new Object[] {accion}, new ClienteMapper());
	}

	/**
	 * Metodo que permite crear, modificar, baja de clientes
	 *
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Cliente>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Cliente> crudCliente(RequestCliente request){
		return daoCliente.crud(queryCRUDCliente, new Object[] {request.getDatos(), request.getDetalle(),request.getAccion()});
	}


}
