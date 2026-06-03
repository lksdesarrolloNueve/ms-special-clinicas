package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.CatFormaPago;

public class CatFormaPagoMapper implements RowMapper<CatFormaPago> {


	@Override
	public CatFormaPago mapRow(ResultSet rs, int rowNum) throws SQLException {
		var formaPago = new CatFormaPago();

		formaPago.setFormaPagoId(rs.getInt(1));
		formaPago.setClaveFPago(rs.getString(2));
		formaPago.setDescripcion(rs.getString(3));
		formaPago.setIcono(rs.getString(4));
		formaPago.setEstatus(rs.getBoolean(5));

		return formaPago;
	}

}
