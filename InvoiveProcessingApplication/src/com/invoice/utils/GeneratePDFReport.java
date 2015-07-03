package com.invoice.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.invoice.vo.PDFDataVO;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class GeneratePDFReport {

	private PdfReader reader;

	private PdfStamper stamper;

	public GeneratePDFReport() {
		// TODO Auto-generated constructor stub
		try {
			reader = new PdfReader("Invoice_Template.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void convertDataIntoPDF(PDFDataVO vo) {
		try {
			stamper = new PdfStamper(reader, new FileOutputStream(
					"D:\\PDFOutput\\Invoice_" + vo.getCustomerId() + "_" + vo.getMeterId() + ".pdf"));
			stamper.getAcroFields().setField("name", vo.getName());
			Date curDate = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			stamper.getAcroFields().setField("invoiceDate", format.format(curDate));
			stamper.getAcroFields().setField("address", vo.getAddress());
			stamper.getAcroFields().setField("meterId", vo.getMeterId().toString());
			stamper.getAcroFields().setField("totalUsage", vo.getTotalUsage() + " units");
			stamper.getAcroFields().setField("netUsage", vo.getTotalUsage() + "");
			stamper.getAcroFields().setField("amt", "" + vo.getAmount());
			if (vo.getFromDate() != null) {
				try {

					Date date = dateFormat.parse(vo.getFromDate());
					stamper.getAcroFields().setField("fromDate", format.format(date));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if (vo.getToDate() != null) {

				try {

					Date date = dateFormat.parse(vo.getToDate());
					stamper.getAcroFields().setField("toDate", format.format(date));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			stamper.getAcroFields().setField("customerId", "" + vo.getCustomerId());
			stamper.getAcroFields().setField("totalAmt", "" + vo.getTOTALAMT());
			stamper.getAcroFields().setField("taxAmt", "" + vo.getTAXAMT());

			stamper.close();
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
