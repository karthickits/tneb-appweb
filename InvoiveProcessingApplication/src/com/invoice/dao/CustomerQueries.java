package com.invoice.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.invoice.mapper.CustomerToUsage;
import com.invoice.mapper.CustomerToUsageMapper;

public class CustomerQueries {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getCustomersCount() {

		String sql = "select count(*) from customer";
		return jdbcTemplate.queryForInt(sql);
	}

	public void callBusinesLogic(int customerID, float taxCalc) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("CALCULATEINVOICEPROCESS");

		Map<String, Object> inParamMap = new HashMap<String, Object>();

		inParamMap.put("CustomerID", customerID);
		inParamMap.put("TaxCalc", taxCalc);

		SqlParameterSource in = new MapSqlParameterSource(inParamMap);

		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);

		System.out.println("Procedure Executed....... ");
	}

	public CustomerToUsage getUsgageDetails(int id) {
		String sql = "select * from customertotalusage where cust_id="+id;
		List<CustomerToUsage> rows = getJdbcTemplate().query(sql, new CustomerToUsageMapper());
		if (rows != null && rows.size() > 0) {
			return rows.get(0);
		} else {
			return null;
		}

	}

}
