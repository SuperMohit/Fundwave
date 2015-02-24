package com.fundwave.proj2;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import com.fundwave.proj1.QuarterFactory;

public class TimePeriod {
	
	private static final int MONTH=1;

	private static final int QUARTER=2;
	
	private static final int YEAR=3;
	
	private static final int DAY=4;
	
	public static List<String> getTimePeriods(Date fromDate, Date toDate, int timePeriod ){
		
		List<String> timeSeq= new ArrayList<String>();
		

		switch (timePeriod) {
		case MONTH:
			timeSeq=MonthFactory.generateMonths(fromDate, toDate);
			break;
		case QUARTER:
			timeSeq=QuarterFactory.generateQuarters(fromDate, toDate);
			break;
		case YEAR:
			timeSeq=YearFactory.generateYears(fromDate, toDate);
			break;
		case DAY:	
			timeSeq=DayFactory.generatedays(fromDate, toDate);
			break;
		default:
			System.out.println("Out of Range");
			timeSeq.add("Out of Range");
			break;
		}
		
		return timeSeq;
		
		
		
	 }

}
