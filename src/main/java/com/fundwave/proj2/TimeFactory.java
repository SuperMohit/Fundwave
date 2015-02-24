package com.fundwave.proj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.StringTokenizer;



public class TimeFactory {
	
	 public static void main(String[] args) throws IOException, ParseException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    	  
  	     String line=br.readLine();
  	  
  	     StringTokenizer tokenizer = new StringTokenizer(line, ",");
  	     String startDateString = tokenizer.nextToken(),endDateString =tokenizer.nextToken();
    	 int timePeriod=Integer.valueOf(tokenizer.nextToken());
  	   
    	 SimpleDateFormat dateFormat= new SimpleDateFormat("dd MMM yyyy");
    	 java.util.Date parsedStart=dateFormat.parse(startDateString);
    	 java.util.Date parsedEnd=dateFormat.parse(endDateString);
    	 
  	     Date fromDate= new Date(parsedStart.getTime()),toDate=new Date(parsedEnd.getTime());
		 
		 List<String> timePeriods=TimePeriod.getTimePeriods(fromDate, toDate, timePeriod);
		
		 for(String t:timePeriods) System.out.println(t);  //Prints result on console
		 
	 }
	

}
