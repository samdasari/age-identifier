package com.qa.ageidentifier;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class AgeIdentifierTest {

	@Test
	public void find_next_reg_number_for_year2009_in_september()
	{
		// Arrange
		
		AgeIdentifier cut = new AgeIdentifier();
		String input = "09";
		String expResult = "59";
		
		//Act
		
		String actualResult = cut.NextCarReg (input);
		
		//Assert
		
		assertEquals(expResult, actualResult);
		
		
		}

	@Test
	public void find_available_car_reg_number_in_January_2009()
	{
		// Arrange
		
		GetCarReg cut = new GetCarReg();
		String input = "January2009";
		String expResult = "09";
		
		//Act
		
		String actualResult = cut.ValidateCarReg (input);
		
		//Assert
		
		assertEquals(expResult, actualResult);
		
		
		}
	}

		


