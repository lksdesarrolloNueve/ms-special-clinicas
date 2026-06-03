package com.green.mx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.mx.dao.IGestionDAO;
import com.green.mx.mapper.ProductoMapper;
import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.request.RequestMasivoProductos;
import com.green.mx.model.response.Producto;
import com.green.mx.service.IProductoService;

@Service
public class ImplProductoService implements IProductoService{

	/**
	 * QUERY PARA OBTENER LOS ALAMCENES DEPENDIENDO DE LA ACCION
	 */
	private String queryGetList ="SELECT * FROM almacen.get_productos(?);";

	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDProducto = "SELECT * FROM almacen.crud_producto(?,?)";

	/**
	 * Query para CRUDS de Alamcenes
	 */
	private String queryCRUDMasivoProducto = "SELECT * FROM almacen.crud_masivo_productos(?,?,?,?)";

	/**
	 * INSTANCIA DE ACCESO A DATOS
	 */
	@Autowired
	private IGestionDAO<Producto> daoProducto;


	/**
	 * Metodo para retornar una lista de Productos
	 * @param accion - 1. Todos los Productos, 2. Productos Activos, 3. Productos inactivos
	 * @return {@link Estatus<Producto>} - Estado de la solicitud con lista
	 */
	@Override
	public Estatus<Producto> getProductos(Integer accion) {
		return daoProducto.getList(queryGetList,  new Object[] {accion}, new ProductoMapper());
	}

	/**
	 * Metodo para permitir crear, modificar, baja de Productos
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Producto>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Producto> crudProducto(Request request) {
		return daoProducto.crud(queryCRUDProducto,  new Object[] {request.getDatos(), request.getAccion()});
	}

	/**
	 * Metodo para la carga masiva de productos con Stock Inicial por Establecimiento
	 * @param requestProductos - Datos a registrar
	 * @return {@link Estatus<Producto>} - Estado de la solicitud
	 */
	@Override
	public Estatus<Producto> crudMasivoProductos(RequestMasivoProductos requestProductos) {
		return daoProducto.crud(queryCRUDMasivoProducto, new Object[] {requestProductos.getProductos(),
				requestProductos.getAlamcenID(), requestProductos.getUsuarioID(), requestProductos.getAccion()});
	}

}
