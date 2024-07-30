package Chapter1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CardCheck {

	boolean checkCardNumber(String cardType, String cardLength,
			String cardNumber) {
		Integer number = null;
		try {
			number = new Integer(cardNumber);
		} catch (ParseException p1) {
			System.out
					.println("Invalid 'cardNumber' argument for checkCardNumber() API");
			p1.printStackTrace();
			return false;
		}

		if ((cardType + cardLength).toUpperCase().equals("DC14")) {
			if ((number >= 30000000 && number <= 30999999)
					|| (number >= 36000000 && number <= 36999999)
					|| (number >= 38000000 && number <= 38999999)
					|| (number >= 39000000 && number <= 39009999)) {
				return true;
			} else {
				return false;
			}
		}

		if ((cardType + cardLength).toUpperCase().equals("DC15")) {
			if ((number >= 20140000 && number <= 20149999)
					|| (number >= 21490000 && number <= 21499999)) {
				return true;
			} else {
				return false;
			}
		}

		if ((cardType + cardLength).toUpperCase().equals("JC16")) {
			if ((number >= 30880000 && number <= 30949999)
					|| (number >= 30960000 && number <= 31029999)
					|| (number >= 31120000 && number <= 31209999)
					|| (number >= 31580000 && number <= 31599999)
					|| (number >= 33370000 && number <= 33499999)
					|| (number >= 35280000 && number <= 35899999)) {
				return true;
			} else {
				return false;
			}
		}
		
		if ((cardType + cardLength).toUpperCase().equals("AX15")) {
			if ((number >= 34000000 && number <= 34999999)
					|| (number >= 37000000 && number <= 37999999)) {
				return true;
			} else {
				return false;
			}
		}
		
		if ((cardType + cardLength).toUpperCase().equals("MC16")) {
			if ((number >= 50000000 && number <= 59999999)) {
				return true;
			} else {
				return false;
			}
		}
		
		if ((cardType + cardLength).toUpperCase().equals("NS16")) {
			if ((number >= 60110000 && number <= 60110999)
					|| (number >= 60112000 && number <= 60119999)) {
				return true;
			} else {
				return false;
			}
		}
		
		if ((cardType + cardLength).toUpperCase().equals("VS13") ||(cardType + cardLength).toUpperCase().equals("VS16") ) {
			if ((number >= 40000000 && number <= 49999999)) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
