package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.VtaFPSesion;

public class VtaFPSesionMapper implements RowMapper<VtaFPSesion>{

	@Override
	public VtaFPSesion mapRow(ResultSet rs, int rowNum) throws SQLException {
		var venta= new VtaFPSesion();

		venta.setVentaID(rs.getLong(1));
		venta.setCveVenta(rs.getString(2));
		venta.setConcepto(rs.getString(3));
		venta.setOperacion(rs.getString(4));
		venta.setDescripcion(rs.getString(5));
		venta.setFechaHora(rs.getString(6));
		venta.setCveFormaPag(rs.getString(7));
		venta.setDescFormaPag(rs.getString(8));
		venta.setMonto(rs.getBigDecimal(9));
		
		return venta;
	}

}
