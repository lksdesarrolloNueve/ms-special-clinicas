package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Apartado;

public class ApartadoMapper implements RowMapper<Apartado> {

	@Override
	public Apartado mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		var apartado = new Apartado();
		
		apartado.setIdApartado(rs.getLong(1));
		apartado.setCveApartado(rs.getString(2));
		apartado.setAlmacen(rs.getString(3));
		apartado.setCliente(rs.getString(4));
		apartado.setUsuario(rs.getString(5));
		apartado.setFecha(rs.getString(6));
		apartado.setHora(rs.getString(7));
		apartado.setFechaVence(rs.getString(8));
		apartado.setMontoTotal(rs.getBigDecimal(9));
		apartado.setMontoResta(rs.getBigDecimal(10));
		apartado.setEstatus(rs.getString(11));
		apartado.setProductos(rs.getString(12));
		

		return apartado;
	}

}
