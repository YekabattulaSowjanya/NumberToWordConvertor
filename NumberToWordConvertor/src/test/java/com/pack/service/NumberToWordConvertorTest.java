package com.pack.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.pack.controller.NumberToWordController;
import com.pack.repository.UnitsAndTensArray;
import com.pack.repository.UnitsAndTensArrayInterface;

public class NumberToWordConvertorTest {
	

	NumberToWordConvertor convertor = new NumberToWordConvertor(new UnitsAndTensArray());

	@Test
	public void When_NumberIsPositiveAndLessThanTen_Returns_NumberInWord()
	{
		int number = 9;
		assertEquals("Nine", convertor.isConvertNumbertoWord(9));
	}
	
	@Test
	public void When_NumberIsPositiveAndLessThanHundred_Returns_NumberInWord()
	{
		int number = 80;
		assertEquals("Eighty", convertor.isConvertNumbertoWord(80));
	}
	
	@Test
	public void When_NumberIsPositiveAndLessThanThousand_Returns_NumberInWord()
	{
		int number = 880;
		assertEquals("Eight Hundred Eighty", convertor.isConvertNumbertoWord(880));
	}
	@Test
	public void When_NumberIsPositiveAndLessThanLakh_Returns_NumberInWord()
	{
		int number = 99999;
		assertEquals("Ninety Nine Thousand Nine Hundred Ninety Nine", convertor.isConvertNumbertoWord(99999));
	}
	
	@Test
	public void When_NumberIsPositiveAndLessThanMillion_Returns_NumberInWord()
	{
		int number = 8800000;
		assertEquals("Eight Millions Eight Lakhs", convertor.isConvertNumbertoWord(8800000));
	}
	@Test
	public void When_NumberIsNegative_Returns_NumberInWord()
	{
		int number = -9;
		assertEquals("-Nine", convertor.isConvertNumbertoWord(-9));
	}
	
}
