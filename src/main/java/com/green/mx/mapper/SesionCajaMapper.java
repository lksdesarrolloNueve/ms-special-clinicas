package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.DetalleCaja;
import com.green.mx.model.response.SesionCaja;

public class SesionCajaMapper implements RowMapper<SesionCaja>{

	@Override
	public SesionCaja mapRow(ResultSet rs, int rowNum) throws SQLException {
		var sesion = new SesionCaja();
		var detalle = new DetalleCaja();

		sesion.setIdSesionCaja(rs.getLong(1));
		sesion.setAbierta(rs.getBoolean(2));
		sesion.setIdUsuario(rs.getString(3));
		sesion.setUsuario(rs.getString(4));

		detalle.setfApertura(rs.getString(5));
		detalle.setfCierre(rs.getString(6));
		detalle.setComentarioA(rs.getString(7));
		detalle.setComentarioC(rs.getString(8));
		detalle.setSaldoInicialSistema(rs.getBigDecimal(9));
		detalle.setSaldoInicialCajero(rs.getBigDecimal(10));
		detalle.setSaldoFinalSistema(rs.getBigDecimal(11));
		detalle.setSaldoFinalCajero(rs.getBigDecimal(12));
		detalle.setDiferencia(rs.getBigDecimal(13));


		sesion.setIdCaja(rs.getInt(14));
		sesion.setCveCaja(rs.getString(15));
		sesion.setDescCaja(rs.getString(16));


		sesion.setDetalleCaja(detalle);

		return sesion;
	}

}
