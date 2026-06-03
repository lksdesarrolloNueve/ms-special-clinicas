package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Salida;

public class SalidasMapper implements RowMapper<Salida>{

	@Override
	public Salida mapRow(ResultSet rs, int rowNum) throws SQLException {
		var salida = new Salida();

		salida.setSalidaID(rs.getLong(1));
		salida.setProducto(rs.getString(2));
		salida.setCantidad(rs.getInt(3));
		salida.setAlmacen(rs.getString(4));
		salida.setUsuario(rs.getString(5));
		salida.setFecha(rs.getString(6));
		salida.setTotalRecords(rs.getLong(7));
		return salida;
	}

}

