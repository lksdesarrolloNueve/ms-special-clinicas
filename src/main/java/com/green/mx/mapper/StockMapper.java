package com.green.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.green.mx.model.response.Stock;

public class StockMapper implements RowMapper<Stock>{

	@Override
	public Stock mapRow(ResultSet rs, int rowNum) throws SQLException {
		var stock = new Stock();

		stock.setProductoID(rs.getInt(1));
		stock.setProducto(rs.getString(2));
		stock.setTotalStock(rs.getLong(3));
		stock.setMinStock(rs.getInt(4));
		stock.setMaxStock(rs.getInt(5));
		stock.setAlmacen(rs.getString(6));

		return stock;
	}

}
