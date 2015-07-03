package com.invoice.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerToUsageMapper implements RowMapper<CustomerToUsage> {

	@Override
	public CustomerToUsage mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		CustomerToUsage usage = new CustomerToUsage();
		usage.setCUST_ID(rs.getString("CUST_ID"));
		usage.setAMT(rs.getString("AMT"));
		usage.setMETER_ID(rs.getString("METER_ID"));
		usage.setFROM_DATE(rs.getString("FROM_DATE"));
		usage.setTO_DATE(rs.getString("TO_DATE"));
		usage.setTOTAL_USAGE(rs.getString("TOTAL_USAGE"));
		usage.setTAXAMT(rs.getString("TAXAMT"));
		usage.setTOTALAMT(rs.getString("TOTALAMT"));
		return usage;
	}

}
