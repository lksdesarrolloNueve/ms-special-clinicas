package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.MovSesionCaja;

public class MovSesionCajaMapper implements RowMapper<MovSesionCaja>{
	
	@Override
	public MovSesionCaja mapRow(ResultSet rs, int rowNum) throws SQLException {
		var movSCaja = new MovSesionCaja();
		
		movSCaja.setIdFPago(rs.getInt(1));
		movSCaja.setCveFPago(rs.getString(2));
		movSCaja.setDescripcion(rs.getString(3));
		movSCaja.setMonto(rs.getBigDecimal(4));
		
		return movSCaja;
	}

	

}
