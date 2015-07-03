package com.invoice.writers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.invoice.context.JobContext;
import com.invoice.dao.CustomerQueries;
import com.invoice.mapper.Customer;
import com.invoice.mapper.CustomerToUsage;
import com.invoice.utils.GeneratePDFReport;
import com.invoice.vo.PDFDataVO;

public class PDFWriters implements ItemWriter<Customer> {

	/**
	 * Generate PDF for entry present in table
	 */

	@Override
	public void write(List<? extends Customer> customer) throws Exception {
		// TODO Auto-generated method stub
		Customer cust = (Customer) customer.get(0);
		System.out.println("Generate Invoice for customer's  : Customer ID  : " + cust.getId());

		GeneratePDFReport pdfReport = new GeneratePDFReport();

		PDFDataVO vo = new PDFDataVO();

		vo.setCustomerId(cust.getId());
		vo.setName(cust.getName());
		vo.setAddress(cust.getAddress());

		CustomerQueries customerQueries = (CustomerQueries) JobContext.getInstance().getBean("customerQueries");
		CustomerToUsage usage = customerQueries.getUsgageDetails(cust.getId());
		if (usage != null) {
			vo.setMeterId(new BigDecimal(usage.getMETER_ID()));
			vo.setAmount(Float.parseFloat(usage.getAMT()));
			vo.setTotalUsage(Integer.parseInt(usage.getTOTAL_USAGE()));
			if (usage.getFROM_DATE() != null) {
				vo.setFromDate(usage.getFROM_DATE());
			}
			if(usage.getTO_DATE()!=null){
				vo.setToDate(usage.getTO_DATE());
			}
			vo.setTAXAMT(usage.getTAXAMT());;
			vo.setTOTALAMT(usage.getTOTALAMT());
		}
		pdfReport.convertDataIntoPDF(vo);

	}

}
