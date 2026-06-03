package com.green.mx.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Entrada;

public class EntradaMapper implements RowMapper<Entrada>{

	@Override
	public Entrada mapRow(ResultSet rs, int rowNum) throws SQLException {
		var entrada = new Entrada();
		
		entrada.setEntradaID(rs.getLong(1));
		entrada.setProveedor(rs.getString(2));
		entrada.setProducto(rs.getString(3));
		entrada.setCantidad(rs.getInt(4));
		entrada.setPrecioCompra(rs.getBigDecimal(5));
		entrada.setPrecioVenta(rs.getBigDecimal(6));
		entrada.setAlmacen(rs.getString(7));
		entrada.setUsuario(rs.getString(8));
		entrada.setFecha(rs.getString(9));
		entrada.setTotalRecords(rs.getLong(10));
		
		return entrada;
	}

}
