package com.fundwave.proj2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;


public class MonthFactory {
	
	
	public static List<String> generateMonths(Date fromDate, Date toDate){
		
		
		List<String> months=new ArrayList<String>();
		LocalDate start=new LocalDate(fromDate), end=new LocalDate(toDate);
		
		while(start.getYear()<end.getYear()||start.getMonthOfYear()<=end.getMonthOfYear()){
			
			
			months.add(start.toString("MMM")+start.toString("YY"));
			start=start.plusMonths(1);
			
		}
		
		
		
		
		return months;
	}
	

}
