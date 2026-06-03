package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.green.mx.model.response.ReporteSalida;

public class ReporteSalidaMapper implements RowMapper<ReporteSalida> {

	@Override
	public ReporteSalida mapRow(ResultSet rs, int rowNum) throws SQLException {
		var salida = new ReporteSalida();

		salida.setProducto(rs.getString(1));
		salida.setCantidad(rs.getLong(2));
		salida.setStock(rs.getLong(3));
		salida.setUsuario(rs.getString(4));
		salida.setEstablecimiento(rs.getString(5));

		return salida;
	}

}
