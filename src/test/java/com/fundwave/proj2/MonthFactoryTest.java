package com.fundwave.proj2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class MonthFactoryTest {

	@Test
	public void testGenerateMonths() {
		
		Date start= Date.valueOf("2013-12-01");
		Date end= Date.valueOf("2014-02-02");
		List<String> result=MonthFactory.generateMonths(start,end);
		List<String> expected=Arrays.asList("Dec13", "Jan14", "Feb14");
		assertThat(result, is(expected));
		
	
		
		start= Date.valueOf("2013-03-31");
		end= Date.valueOf("2013-04-01");
		result=MonthFactory.generateMonths(start,end);
		expected=Arrays.asList("Mar13", "Apr13");
		assertThat(result, is(expected));
		
		
	}

}
