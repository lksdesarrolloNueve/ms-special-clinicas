package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.TotalOperacion;

public class TotalOperacionMapper implements RowMapper<TotalOperacion>{

	@Override
	public TotalOperacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		var total = new TotalOperacion();
		
		total.setCveOperacion(rs.getString(1));
		total.setDescripcion(rs.getString(2));
		total.setTotal(rs.getBigDecimal(3));
		
		return total;
	}

}
