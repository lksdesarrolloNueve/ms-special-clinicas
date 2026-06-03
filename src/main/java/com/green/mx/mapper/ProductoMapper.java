package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.DetalleProducto;
import com.green.mx.model.response.Producto;

public class ProductoMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		var producto = new Producto();
		var detalle = new DetalleProducto();

		producto.setProductoID(rs.getInt(1));
		producto.setNombre(rs.getString(2));
		producto.setDescripcion(rs.getString(3));
		producto.setCodigo(rs.getString(4));

		detalle.setStock(rs.getInt(5));
		detalle.setMinStock(rs.getInt(6));
		detalle.setMaxStock(rs.getInt(7));
		detalle.setIva(rs.getBoolean(8));
		detalle.setPtv(rs.getBoolean(9));
		detalle.setPrecioCosto(rs.getBigDecimal(10));
		detalle.setPrecioVenta(rs.getBigDecimal(11));
		detalle.setBascula(rs.getBoolean(16));

		producto.setFechaAlta(rs.getString(12));
		producto.setEstatus(rs.getBoolean(13));
		producto.setCategoria(rs.getString(14));
		producto.setTipoProducto(rs.getString(15));






		producto.setDetalle(detalle);

		return producto;
	}

}
