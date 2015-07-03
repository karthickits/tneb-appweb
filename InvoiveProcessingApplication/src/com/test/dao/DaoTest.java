package com.test.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] springConfig = { "configurations/JobDatabase.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		CustomerQueries customerQueries=(CustomerQueries) context.getBean("customerQueries");
		
		System.out.println("Total Count : "+customerQueries.getUsgageDetails(11).getMETER_ID());*/
		
		//System.out.println(Math.ceil(62342.25));
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String dateInString = "2015-06-01 19:20:50";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
	 
			Date date = dateFormat.parse(dateInString);
			System.out.println(date);
			System.out.println(dateFormat.format(date));
			System.out.println(format.format(date));
	 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
