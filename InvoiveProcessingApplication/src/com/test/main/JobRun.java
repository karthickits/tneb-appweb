package com.test.main;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;

import com.invoice.context.JobContext;

public class JobRun {

	public static void main(String[] args) {
		System.out.println("Job Started : "+new Date());
		JobLauncher jobLauncher = (JobLauncher) JobContext.getInstance().getBean("jobLauncher");
		Job job = (Job) JobContext.getInstance().getBean("invoicePartitionJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Exit Status : " + execution.getAllFailureExceptions());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Job End :"+new Date());
	}
}
