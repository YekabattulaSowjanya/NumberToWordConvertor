package com.pack.service;

import com.pack.repository.*;


public class NumberToWordConvertor implements NumberToWordConvertorInterface {
	

	UnitsAndTensArray array;

	public NumberToWordConvertor(UnitsAndTensArray array) {
		this.array = array;

	}
	
	public String isConvertNumbertoWord(int number) {
	

		if (number < 0) {
			return "-" + isConvertNumbertoWord(-(number));
		}
		
		if (number < 10 ) { 
			return array.digits[number]; 
			}
		if (number < 20 ) { 
			return array.TEN_THROUGH_NINTEEN[(number % 10) +1]; 
			}
		 
		if (number < 100) {

			return array.tensArray[number / 10] + ((number % 10 != 0) ? " " : "") + array.digits[number % 10];
			
		}
		if (number < 1000) {

			return array.digits[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "")
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

