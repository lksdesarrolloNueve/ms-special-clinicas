package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Caja;

public class CajaMapper implements RowMapper<Caja> {

	@Override
	public Caja mapRow(ResultSet rs, int rowNum) throws SQLException {
		var caja = new Caja();
		
		caja.setCajaId(rs.getInt(1));
		caja.setCveCaja(rs.getString(2));
		caja.setDescripcion(rs.getString(3));
		caja.setAlmacen(rs.getString(4));
		caja.setSaldoCierre(rs.getBigDecimal(5));
		caja.setEstatus(rs.getBoolean(6));
		
		return caja;
	}

	
	
}
