package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Almacen;

public class AlmacenMapper implements RowMapper<Almacen>{

	@Override
	public Almacen mapRow(ResultSet rs, int rowNum) throws SQLException {
		var almacen = new Almacen();

		almacen.setAlmacenID(rs.getInt(1));
		almacen.setNombre(rs.getString(2));
		almacen.setDescripcion(rs.getString(3));
		almacen.setFechaAlta(rs.getString(4));
		almacen.setEstatus(rs.getBoolean(5));

		return almacen;
	}

}
