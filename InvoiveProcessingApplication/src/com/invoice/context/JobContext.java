package com.invoice.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class JobContext {

	static String[] springConfig = { "configurations/JobConfiguration.xml" };

	static ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

	public static ApplicationContext getInstance() {
		return context;
	}

}
