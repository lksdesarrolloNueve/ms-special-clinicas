package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.CatOperacion;

public class CatOperacionMapper  implements RowMapper<CatOperacion> {

	@Override
	public CatOperacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		var op = new CatOperacion();

		op.setOperacionId(rs.getInt(1));
		op.setClave(rs.getString(2));
		op.setDescripcion(rs.getString(3));
		op.setOperacion(rs.getString(4));
		op.setEstatus(rs.getBoolean(5));


		return op;
	}


}
