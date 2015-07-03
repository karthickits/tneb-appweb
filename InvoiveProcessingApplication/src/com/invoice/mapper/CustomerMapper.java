package com.invoice.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		cust.setId(rs.getInt("id"));
		cust.setName(rs.getString("name"));
		cust.setEmail_address(rs.getString("email_address"));
		cust.setAddress(rs.getString("address"));
		return cust;
	}

}
