package com.invoice.partition;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import com.invoice.context.JobContext;
import com.invoice.dao.CustomerQueries;

public class RangePartitioner implements Partitioner {

	private int startCustomerID;

	public int getStartCustomerID() {
		return startCustomerID;
	}

	public void setStartCustomerID(int startCustomerID) {
		this.startCustomerID = startCustomerID;
	}

	/**
	 * 1.Retrieve Total count of customers to generate Invoice 2.Get the List of
	 * customers for specified date range 2.Split in even for all slaves and it
	 * to ExecutionContext
	 */

	@Override
	public Map<String, ExecutionContext> partition(int threadCount) {
		Map<String, ExecutionContext> result = new HashMap<String, ExecutionContext>();
		CustomerQueries customerQueries = (CustomerQueries) JobContext.getInstance().getBean("customerQueries");
		int totalCount = customerQueries.getCustomersCount();
		if (totalCount > 0) {
			int threadLoad = (int) Math.ceil(totalCount / threadCount);
			int range = threadLoad;
			int endCustomerID = range;
			for (int i = 1; i <= threadCount; i++) {
				ExecutionContext value = new ExecutionContext();
				value.putInt("StartCustomerId", startCustomerID);
				value.putInt("EndCustomerId", endCustomerID);

				// give each thread a name
				value.putString("ThreadName", "Slave_" + i);

				result.put("partition" + i, value);

				System.out.println("StartCustomerId : " + startCustomerID + "EndCustomerId :" + endCustomerID
						+ " Thread Name : Slave_" + i);
				startCustomerID = endCustomerID + 1;
				endCustomerID += range;
				
			}
		}
		/*ExecutionContext value = new ExecutionContext();
		value.putInt("StartCustomerId", startCustomerID);
		value.putInt("EndCustomerId", 11);
		value.putString("ThreadName", "Slave_" + 1);
		result.put("partition" + 1, value);*/
		return result;
	}

}
