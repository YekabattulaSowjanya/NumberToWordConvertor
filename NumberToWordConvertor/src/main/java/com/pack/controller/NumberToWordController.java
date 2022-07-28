package com.pack.controller;

import java.util.Scanner;

import com.pack.repository.UnitsAndTensArray;
import com.pack.service.NumberToWordConvertorImpl;
import com.pack.service.NumberToWordConvertorInterface;

public class NumberToWordController {
	
	
public static void main(String[] args) {
		
	NumberToWordConvertorImpl convertor = new NumberToWordConvertorImpl(new UnitsAndTensArray());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number Which you want to convert :");
		
		int number = sc.nextInt();
		
		String Word = convertor.isConvertNumbertoWord(number);
		
		System.out.println(Word);
	}
}
