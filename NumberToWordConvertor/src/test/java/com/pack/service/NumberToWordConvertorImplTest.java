package com.pack.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.pack.controller.NumberToWordController;
import com.pack.repository.UnitsAndTensArray;
import com.pack.repository.UnitsAndTensArrayInterface;

public class NumberToWordConvertorImplTest {
	

	NumberToWordConvertorImpl convertor = new NumberToWordConvertorImpl(new UnitsAndTensArray());

	@Test
	public void When_NumberIsPositiveAndLessThanTen_Returns_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(9)).thenReturn("Nine");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Nine", convert.isConvertNumbertoWord(9));
	}
	@Test
	public void When_NumberIsPositiveAndLessThanTwenty_Returns_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(17)).thenReturn("Seventeen");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Seventeen", convert.isConvertNumbertoWord(17));
	}
	@Test
	public void When_NumberIsPositiveAndLessThanHundred_Returns_NumberInWord()
	{	
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(89)).thenReturn("Eighty Nine");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Eighty Nine", convert.isConvertNumbertoWord(89));
		
	}
	@Test
	public void When_NumberIsPositiveAndLessThanThousand_Returns_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(799)).thenReturn("Seven Hundred Ninety Nine");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Seven Hundred Ninety Nine", convert.isConvertNumbertoWord(799));
	}
	
	@Test
	public void When_NumberIsPositiveAndLessThanLakh_Returns_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(87234)).thenReturn("Eighty Seven Thousand Two Hundred Thirty Four");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Eighty Seven Thousand Two Hundred Thirty Four", convert.isConvertNumbertoWord(87234));
	}
	@Test
	public void When_NumberIsPositiveAndLessThanMillion_Returns_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(732847)).thenReturn("Seven Lakhs Thirty Two Thousand Eight Hundred Forty Seven");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Seven Lakhs Thirty Two Thousand Eight Hundred Forty Seven", convert.isConvertNumbertoWord(732847));
	}
	@Test
	public void When_NumberIsPositiveAndLessThanMillion_Return_NumberInWord()
	{
		NumberToWordConvertorInterface convert = mock(NumberToWordConvertorInterface.class);
		when(convert.isConvertNumbertoWord(98765432)).thenReturn("Ninety Eight Millions Seven Lakhs Sixty Five Thousand Four Hundred Thirty Two");
		convertor = new NumberToWordConvertorImpl(convert);
		assertEquals("Ninety Eight Millions Seven Lakhs Sixty Five Thousand Four Hundred Thirty Two", convert.isConvertNumbertoWord(98765432));
	}
}
