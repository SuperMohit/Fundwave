package com.fundwave.proj2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class DayFactory {

	
	
	
public static List<String> generatedays(Date fromDate, Date toDate){
		
		List<String> days=new ArrayList<String>();
		LocalDate start=new LocalDate(fromDate), end=new LocalDate(toDate);
		
		while(start.isBefore(end)||start.isEqual(end)){
			
			
			days.add(start.toString("dd")+" "+start.toString("MMM"));
			start=start.plusDays(1);
			
		}
		
		
		
		
		return days;
}
}
