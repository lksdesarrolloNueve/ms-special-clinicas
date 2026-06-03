package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Rol;

public class RolMapper implements RowMapper<Rol>{

	@Override
	public Rol mapRow(ResultSet rs, int rowNum) throws SQLException {
		var rol = new Rol();

		rol.setRolID(rs.getInt(1));
		rol.setNombre(rs.getString(2));
		rol.setEstatus(rs.getBoolean(3));

		return rol;
	}

}
