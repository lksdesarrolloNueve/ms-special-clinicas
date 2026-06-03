package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.ReporteEntrada;

public class ReporteEntradaMapper implements RowMapper<ReporteEntrada>{

	@Override
	public ReporteEntrada mapRow(ResultSet rs, int rowNum) throws SQLException {
		var entrada = new ReporteEntrada();
		
		entrada.setProducto(rs.getString(1));
		entrada.setCantidad(rs.getLong(2));
		entrada.setStock(rs.getLong(3));
		entrada.setPrecioCompra(rs.getBigDecimal(4));
		entrada.setPrecioVenta(rs.getBigDecimal(5));
		entrada.setUsuario(rs.getString(6));
		entrada.setEstablecimiento(rs.getString(7));
		
		return entrada;
	}

}
