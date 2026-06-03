package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Venta;

public class VentaMapper implements RowMapper<Venta>{

	@Override
	public Venta mapRow(ResultSet rs, int rowNum) throws SQLException {

		var venta = new Venta();


		venta.setCantidad(rs.getInt(1));
		venta.setPrecioUnitario(rs.getBigDecimal(2));
		venta.setSubtotal(rs.getBigDecimal(3));
		venta.setIdProducto(rs.getInt(4));
		venta.setNombre(rs.getString(5));
		venta.setDescripcion(rs.getString(6));
		venta.setCodigo(rs.getString(7));


		return venta;
	}


}
