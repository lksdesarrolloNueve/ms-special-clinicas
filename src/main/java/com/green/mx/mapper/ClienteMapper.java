package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Cliente;

public class ClienteMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		var cliente=new Cliente();
		
		cliente.setClienteID(rs.getLong(1));
		cliente.setCveCliente(rs.getString(2));
		cliente.setNombre(rs.getString(3));
		cliente.setaPaterno(rs.getString(4));
		cliente.setaMaterno(rs.getString(5));
		cliente.setFechaNac(rs.getString(6));
		cliente.setTelefono(rs.getString(7));
		cliente.setEmail(rs.getString(8));
		cliente.setDetalle(rs.getString(9));
		cliente.setEstatus(rs.getBoolean(10));
		
		return cliente;
	}

}
