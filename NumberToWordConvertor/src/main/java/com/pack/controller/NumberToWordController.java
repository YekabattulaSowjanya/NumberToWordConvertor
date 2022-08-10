package com.pack.controller;

import java.util.Scanner;

import com.pack.repository.UnitsAndTensArray;
import com.pack.service.*;


public class NumberToWordController {
	
	
	
	public static void main(String[] args) {
		
		 NumberToWordConvertor convertor = new NumberToWordConvertor(new UnitsAndTensArray());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to convert");
		
		int number = sc.nextInt();
		
		String Word = convertor.isConvertNumbertoWord(number);
		
		System.out.println(Word);
		
	}
	
	
}
