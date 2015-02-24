package com.fundwave.proj1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class QuarterFactoryTest {

	@Test
	public void testGenerateQuarters() {
		
	//Test1: Give in the sample
		Date start= Date.valueOf("2013-05-01");
		Date end= Date.valueOf("2014-09-02");
		List<String> result=QuarterFactory.generateQuarters(start,end);
		List<String> expected=Arrays.asList("Jun13", "Sep13", "Dec13", "Mar14", "Jun14", "Sep14");
		assertThat(result, is(expected));
		
	//Test2: 31st March 2013 and 1st April 2013
		
		start= Date.valueOf("2013-03-31");
		end= Date.valueOf("2013-04-01");
		result=QuarterFactory.generateQuarters(start,end);
		expected=Arrays.asList("Mar13", "Jun13");
		assertThat(result, is(expected));
		
		
	}

}
