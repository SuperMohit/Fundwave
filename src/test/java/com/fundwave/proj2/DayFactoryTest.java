package com.fundwave.proj2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DayFactoryTest {

	@Test
	public void testGeneratedays() {
		
		//Leap Year 29 Feb
		Date start= Date.valueOf("2016-02-28");
		Date end= Date.valueOf("2016-03-01");
		List<String> result=DayFactory.generatedays(start,end);
		List<String> expected=Arrays.asList("28 Feb", "29 Feb", "01 Mar");
		assertThat(result, is(expected));
		

		//Year Transition
		start= Date.valueOf("2013-12-31");
		end= Date.valueOf("2014-01-01");
		result=DayFactory.generatedays(start,end);
		expected=Arrays.asList("31 Dec", "01 Jan");
		assertThat(result, is(expected));
		
		
	}

}
