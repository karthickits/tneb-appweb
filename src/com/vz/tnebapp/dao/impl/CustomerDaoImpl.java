package com.vz.tnebapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vz.tnebapp.dao.CustomerDao;
import com.vz.tnebapp.model.Customer;
import com.vz.tnebapp.util.DBUtil;

public class CustomerDaoImpl implements CustomerDao{

	
	@Override
	public int addCustomer(Customer customer) {
		Connection conn = DBUtil.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rs =st.executeQuery("select max(ID) as ID from CUSTOMER ");
			int maxId = 0;
			if(rs.next()){
				maxId = rs.getInt("ID") + 1;
			} else {
				maxId = 1;
			}
			PreparedStatement stmt = conn.prepareStatement("insert into CUSTOMER(ID,NAME,AGE,EMAIL_ADDRESS,GENDER,ADDRESS) values(?,?,?,?,?,?)");
			stmt.setInt(1, maxId);
			stmt.setString(2, customer.getName());
			stmt.setString(3, customer.getAge());
			stmt.setString(4, customer.getEmailAddress());
			stmt.setString(5, customer.getGender());
			stmt.setString(6, customer.getAddress());
			int returnCnt = stmt.executeUpdate();
			
			Statement st2 = conn.createStatement();
			ResultSet rs2 =st2.executeQuery("select max(METER_ID) as ID2 from METER ");
			int maxId2 = 0;
			if(rs.next()){
				maxId2 = rs2.getInt("ID2") + 1;
			} else {
				maxId2 = 1;
			}
			
			PreparedStatement stmt2 = conn.prepareStatement("insert into METER(ID,TYPE,CUSTOMER_ID) values(?,?,?)");
			stmt2.setInt(1, maxId2);
			stmt2.setString(2, "Standard");
			stmt2.setInt(3, maxId);
			stmt2.executeUpdate();
			return returnCnt;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
	
	
	
	
}
