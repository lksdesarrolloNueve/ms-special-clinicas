/**
 * 
 */
package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.ReimprimirTicket;

/**
 * @author lksbaassadecv
 *
 */
public class ReimprimirTicketMapper implements RowMapper<ReimprimirTicket>{

	@Override
	public ReimprimirTicket mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Instancia
		var reimprimir=new ReimprimirTicket();
		//Seteo de datos
		reimprimir.setCajero(rs.getString(1));
		reimprimir.setCliente(rs.getString(2));
		reimprimir.setClaveVenta(rs.getString(3));
		reimprimir.setDescuento(rs.getBigDecimal(4));
		reimprimir.setDireccion(rs.getString(5));
		reimprimir.setAlmacen(rs.getString(6));
		reimprimir.setFechaHora(rs.getString(7));
		reimprimir.setFormasPago(rs.getString(8));
		reimprimir.setProductos(rs.getString(9));
		reimprimir.setApartados(rs.getString(10));
		reimprimir.setMontoResta(rs.getBigDecimal(11));
		
		return reimprimir;
	}

}
