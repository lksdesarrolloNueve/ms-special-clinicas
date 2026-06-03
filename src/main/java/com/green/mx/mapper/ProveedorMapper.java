package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Proveedor;

public class ProveedorMapper implements RowMapper<Proveedor>{

	@Override
	public Proveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
		var proveedor = new Proveedor();

		proveedor.setProveedorID(rs.getInt(1));
		proveedor.setNombre(rs.getString(2));
		proveedor.setTelefono(rs.getString(3));
		proveedor.setEmail(rs.getString(4));
		proveedor.setDireccion(rs.getString(5));
		proveedor.setCp(rs.getInt(6));
		proveedor.setFechaAlta(rs.getString(7));
		proveedor.setEstatus(rs.getBoolean(8));
		proveedor.setCveProveedor(rs.getString(9));

		return proveedor;
	}

}

