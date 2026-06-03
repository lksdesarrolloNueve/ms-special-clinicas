package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.CatTipoProducto;

public class CatTipoProductoMapper implements RowMapper<CatTipoProducto> {

	
	@Override
	public CatTipoProducto mapRow(ResultSet rs, int rowNum) throws SQLException {
		var ctp = new CatTipoProducto();
		
		ctp.setIdTipoProducto(rs.getInt(1));
		ctp.setCveTipoProducto(rs.getString(2));
		ctp.setDescripcion(rs.getString(3));
		ctp.setEstatus(rs.getBoolean(4));
		
		return ctp;
	}
	
}
