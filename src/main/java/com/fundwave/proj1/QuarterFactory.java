package com.fundwave.proj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;





import java.util.StringTokenizer;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;


public class QuarterFactory {
       private final static int Q1_INDEX=3;
       private final static int Q2_INDEX=6;
       private final static int Q3_INDEX=9;
       private final static int Q4_INDEX=12;
       
     
	  private final static String Q1_DATE = "-04-01";
	  private final static String Q2_DATE = "-07-01";
	  private final static String Q3_DATE = "-10-01";
	  private final static String Q4_DATE = "-01-01";
     
       private static List <String> quarter=new ArrayList<String>();
       public static void main(String[] args) throws IOException {
		 
    	 
    	   
    	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    	  
    	   
    	   
    	   String line=br.readLine();
    	  
    	   StringTokenizer tokenizer = new StringTokenizer(line, ",");
    	   String startDateString = tokenizer.nextToken(),endDateString =tokenizer.nextToken();
    	   
    	   Date startDate= Date.valueOf(startDateString),endDate= Date.valueOf(endDateString);
    	   
    	    
    	   generateQuarters(startDate, endDate);   //call this directly if i/p is java.sql.Date
    	    
    	   for(String q: quarter)   //Printing Quarters in console
				System.out.println(q);
    	  
		
	}

       
       public static List<String> generateQuarters(Date startDate, Date endDate){

    		
    			
    			LocalDate start =new LocalDate(startDate), end=new LocalDate(endDate); //Converting to Joda LocalDate 
    			int monthIndex;
    			quarter.clear();   //flush arraylist
    			
    			while(start.isBefore(end)||start.isEqual(end)){
    				monthIndex=start.getMonthOfYear();
    				
    				if(monthIndex<=Q1_INDEX){
    					addToList(Q1_INDEX, start);
    					
    					start= resetStart(start, Q1_DATE); //reset to reduce needless iterations
    					if(isMore(start, end)) break;
    					
    					
    				}
    				else if (monthIndex>Q1_INDEX&&monthIndex<=Q2_INDEX){
    					
    					addToList(Q2_INDEX, start);
    					
    					start= resetStart(start, Q2_DATE);
    					if(isMore(start, end)) break;
    				
    				}
    				else if (monthIndex>Q2_INDEX&&monthIndex<=Q3_INDEX){
    					addToList(Q3_INDEX, start);
    					
    					start= resetStart(start, Q3_DATE);
    					if(isMore(start, end)) break;
    				
    				}
    				else{
    					addToList(Q4_INDEX, start);
    					
    					start= new LocalDate(String.valueOf(start.getYear()+1)+ Q4_DATE);
    					if(isMore(start, end)) break;
    				
    				}  	   	   				
    			   			
    			}
    			return quarter;     //used by proj2
    			
    			}
    	   
    	   
       
      
       
       public static void addToList(int qIndex,LocalDate start){
    	   quarter.add(DateTime.now().withMonthOfYear(qIndex).toString("MMM")+start.toString("YY"));
    	   
       }
       
       public static LocalDate resetStart(LocalDate start, String qDate){
		 
    	
    	   return new LocalDate(String.valueOf(start.getYear())+qDate);
    	  
    	   
       }
       
       public static Boolean isMore(LocalDate start,LocalDate end){
    	   
    	   return !start.isEqual(end)&&!start.isBefore(end);
       }
       
}
