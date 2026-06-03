package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Menu;

public class MenuMapper implements RowMapper<Menu>{

	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		var menu = new Menu();

		menu.setMenuID(rs.getInt(1));
		menu.setTitulo(rs.getString(2));
		menu.setDescripcion(rs.getString(3));
		menu.setIcon(rs.getString(4));
		menu.setPathurl(rs.getString(5));
		menu.setEstatus(rs.getBoolean(6));

		return menu;
	}

}
