
public class IntWord {
	
	public String convertInt(int num) {
		String numString = Integer.toString(num);
		String numWord = "";
		int numLen = numString.length();
		if (numLen == 1) {
			numWord = lengthOne(num,numWord);
		} else if (numLen == 2) {
			numWord = lengthTwo(num,numWord);
		} else if (numLen == 3) {
			numWord = lengthThree(num,numWord);
		} else if (numLen == 4) {
			numWord = lengthFour(num,numWord);
		} else {
			System.out.println("Invalid number length");
		}	
		return numWord;
	}
	
	public String lengthOne(int oneDigit,String string1) {
		String numberWord = string1;
		switch(oneDigit) {
		case 1 : numberWord = numberWord + " One";break;
		case 2 : numberWord = numberWord + " Two";break;
		case 3 : numberWord = numberWord + " Three";break;
		case 4 : numberWord = numberWord + " Four";break;
		case 5 : numberWord = numberWord + " Five";break;
		case 6 : numberWord = numberWord + " Six";break;
		case 7 : numberWord = numberWord + " Seven";break;
		case 8 : numberWord = numberWord + " Eight";break;
		case 9 : numberWord = numberWord + " Nine";break;
		default: numberWord = numberWord + "";break;
		}
		//System.out.println(numberWord);
		return numberWord;
	}
	
	public String lengthTwo(int twoDigit,String string2) {
		String numberWord = string2;
		if(twoDigit < 20) {
			switch(twoDigit%10) {
			case 0 : numberWord = numberWord + " and Ten";break;
			case 1 : numberWord = numberWord + " and Eleven";break;
			case 2 : numberWord = numberWord + " and Twelve";break;
			case 3 : numberWord = numberWord + " and Thirteen";break;
			case 4 : numberWord = numberWord + " and Fourteen";break;
			case 5 : numberWord = numberWord + " and Fifteen";break;
			case 6 : numberWord = numberWord + " and Sixteen";break;
			case 7 : numberWord = numberWord + " and Seventeen";break;
			case 8 : numberWord = numberWord + " and Eighteen";break;
			case 9 : numberWord = numberWord + " and Nineteen";break;
			default: numberWord = numberWord + "";break;
			}
			//System.out.println(numberWord);
		} else {
			switch(twoDigit/10) {
			case 2 : numberWord = numberWord + " and Twenty";break;
			case 3 : numberWord = numberWord + " and Thirty";break;
			case 4 : numberWord = numberWord + " and Fourty";break;
			case 5 : numberWord = numberWord + " and Fifty";break;
			case 6 : numberWord = numberWord + " and Sixty";break;
			case 7 : numberWord = numberWord + " and Seventy";break;
			case 8 : numberWord = numberWord + " and Eighty";break;
			case 9 : numberWord = numberWord + " and Ninety";break;
			}
			int modTen = twoDigit%10;
			numberWord = lengthOne(modTen,numberWord);
		}
		return numberWord;
	}
	
	public String lengthThree(int threeDigit,String string3) {
		String numberWord = string3;
		switch(threeDigit/100) {
		case 1 : numberWord = numberWord + " One Hundred"; break;
		case 2 : numberWord = numberWord + " Two Hundred"; break;
		case 3 : numberWord = numberWord + " Three Hundred"; break;
		case 4 : numberWord = numberWord + " Four Hundred";break;
		case 5 : numberWord = numberWord + " Five Hundred";break;
		case 6 : numberWord = numberWord + " Six Hundred";break;
		case 7 : numberWord = numberWord + " Seven Hundred";break;
		case 8 : numberWord = numberWord + " Eight Hundred";break;
		case 9 : numberWord = numberWord + " Nine Hundred";break;
		default: numberWord = numberWord + ""; break;
		}
//		int divTen = threeDigit/10;
		int modHun = threeDigit%100;
		if(modHun%100<10) {
			numberWord = lengthOne(modHun,numberWord);
		} else {
			numberWord = lengthTwo(modHun,numberWord);
		}
		return numberWord;
	}
	
	public String lengthFour(int fourDigit,String string4) {
		String numberWord = string4;
		switch(fourDigit/1000) {
		case 1 : numberWord = numberWord + " One Thousand";break;
		case 2 : numberWord = numberWord + " Two Thousand";break;
		case 3 : numberWord = numberWord + " Three Thousand";break;
		case 4 : numberWord = numberWord + " Four Thousand";break;
		case 5 : numberWord = numberWord + " Five Thousand";break;
		case 6 : numberWord = numberWord + " Six Thousand";break;
		case 7 : numberWord = numberWord + " Seven Thousand";break;
		case 8 : numberWord = numberWord + " Eight Thousand";break;
		case 9 : numberWord = numberWord + " Nine Thousand";break;
		default: numberWord = numberWord + ""; break;
		}
		int modHun = fourDigit%1000;
		numberWord = lengthThree(modHun,numberWord);
		return numberWord;
	}

}
