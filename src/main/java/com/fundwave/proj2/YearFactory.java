package com.fundwave.proj2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class YearFactory {
	
	
public static List<String> generateYears(Date fromDate, Date toDate){
		
		List<String> years=new ArrayList<String>();
		LocalDate start=new LocalDate(fromDate), end=new LocalDate(toDate);
		
		while(start.getYear()<=end.getYear()){
			
			
			years.add(start.toString("YYYY"));
			start=start.plusYears(1);
			
		}
		
		
		
		
		return years;
	
}

}
