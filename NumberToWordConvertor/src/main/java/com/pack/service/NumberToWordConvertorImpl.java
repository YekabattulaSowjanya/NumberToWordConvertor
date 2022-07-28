package com.pack.service;

import com.pack.repository.*;
import java.util.Scanner;

public class NumberToWordConvertorImpl implements NumberToWordConvertorInterface {

	public NumberToWordConvertorImpl() {

	}

	public NumberToWordConvertorImpl(UnitsAndTensArray array) {
		this.array = array;

	}
	public NumberToWordConvertorImpl(NumberToWordConvertorInterface convert) {
		// TODO Auto-generated constructor stub
	}
	UnitsAndTensArray array;
	
	
	public String isConvertNumbertoWord(int number) {
		// for minus numbers
		
		if (number < 0) {
			return "-" + isConvertNumbertoWord(-(number));
		}
		
		
		if (number < 20 ) { 
			return array.unitsArray[number]; 
			}
		 
		 

		if (number < 100) {

			return array.tensArray[number / 10] + ((number % 10 != 0) ? " " : "") + array.unitsArray[number % 10];

		}
		if (number < 1000) {

			return array.unitsArray[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "")
					+ isConvertNumbertoWord(number % 100);

		}
		if (number < 100000) {

			return isConvertNumbertoWord(number / 1000) + " Thousand" + ((number % 10000 != 0) ? " " : "")
					+ isConvertNumbertoWord(number % 1000);

		}
		if (number < 1000000) {

			return isConvertNumbertoWord(number / 100000) + " Lakhs" + ((number % 100000 != 0) ? " " : "")
					+ isConvertNumbertoWord(number % 100000);

		}

		return isConvertNumbertoWord(number / 1000000) + " Millions" + ((number % 1000000 != 0) ? " " : "")
				+ isConvertNumbertoWord(number % 1000000);
	}

}
