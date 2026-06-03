package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Categoria;

public class CategoriaMapper implements RowMapper<Categoria>{

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		var categoria = new Categoria();
		
		categoria.setCategoriaID(rs.getInt(1));
		categoria.setNombre(rs.getString(2));
		categoria.setDescripcion(rs.getString(3));
		categoria.setEstatus(rs.getBoolean(4));
		categoria.setCveCategoria(rs.getString(5));
		
		return categoria;
	}

}

