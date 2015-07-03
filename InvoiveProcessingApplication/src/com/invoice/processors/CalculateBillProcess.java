package com.invoice.processors;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.invoice.context.JobContext;
import com.invoice.dao.CustomerQueries;
import com.invoice.mapper.Customer;

@Component("itemProcessor")
@Scope(value = "step")
public class CalculateBillProcess implements ItemProcessor<Customer, Customer> {

	@Value("#{stepExecutionContext[ThreadName]}")
	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	/**
	 * Calculation Process ....
	 * 1. Get the Meter Readings from table.
	 * 2. Accculmate Total Values for each customer 
	 * 3. Calculate charges based on seed data. 
	 * 4. Apply configured tax for amount
	 */

	@Override
	public Customer process(Customer item) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(threadName + " processing : " + item.getId() + " : " + item.getName());
		CustomerQueries customerQueries = (CustomerQueries) JobContext.getInstance().getBean("customerQueries");
		customerQueries.callBusinesLogic(item.getId(), 10);
		return item;
	}

}
