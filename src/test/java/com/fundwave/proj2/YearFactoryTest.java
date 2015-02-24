package com.fundwave.proj2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class YearFactoryTest {

	@Test
	public void testGenerateYears() {

		
		//Century Transition
		Date start= Date.valueOf("1999-12-01");
		Date end= Date.valueOf("2000-02-02");
		List<String> result=YearFactory.generateYears(start,end);
		List<String> expected=Arrays.asList("1999", "2000");
		assertThat(result, is(expected));
		
	
		//Same Year
		start= Date.valueOf("2001-03-31");
		end= Date.valueOf("2001-04-01");
		result=YearFactory.generateYears(start,end);
		expected=Arrays.asList("2001");
		assertThat(result, is(expected));
	}

}
