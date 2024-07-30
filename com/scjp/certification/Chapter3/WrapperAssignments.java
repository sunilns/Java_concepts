package Chapter3;

public class WrapperAssignments {
	public static void main(String[] args) {
		Byte bb1 = 25;
		Integer ii1 = 25;
		Short ss1 = 25;
		
		Integer ii2 = 1000;
		Integer ii3 = 1000;
		Short ss2 = 2000;
		Short ss3 = 2000;
		
		//System.out.println("bb1 == ii1 : is : "+(bb1 == ii1));   // this wont compile since they are of diff type
		System.out.println("bb1.equals(ii1) : is : "+bb1.equals(ii1)); //this compiles but always returns FALSE
		System.out.println("bb1.equals(ss1) : is : "+bb1.equals(ss1)); //this compiles but always returns FALSE
		
		System.out.println("bb1.equals(bb1) : is : "+bb1.equals(bb1));
		System.out.println("WITHIN : -128 TO 127 RANGE : bb1 == bb1 : is : "+(bb1 == bb1));
		
		System.out.println("ii2.equals(ii3) : is : "+ii2.equals(ii3));
		System.out.println("ss2.equals(ss3) : is : "+ss2.equals(ss3));//Short ss2 = 2000;
		
		System.out.println("NOT WITHIN : -128 TO 127 RANGE (Integer) : ii2 == ii3 : is : "+(ii2 == ii3));
		System.out.println("NOT WITHIN : -128 TO 127 RANGE (Short): ss2 == ss3 : is : "+(ss2 == ss3));
		System.out.println("----------------------------------------------------");
		
		//Explore all functions of JAVA
		//Most of the functions of wrapper classes are Static. 
		//In most of the cases they return their respective Wrapper type.
		//ONLY CHARACTER wrapper type provides ONLY one Constructor, NO STRING VERSION!
		//ONLY xxxValue() type function supported for Character is charValue
		//Character wrapper type can be used to get different special characters like, c1.CURRENCY_SYMBOL

		//Boolean wrapper type : rule to determine TRUE and FALSE is, 
		//RULE 1 : Boolean is TRUE : when String content is "true" (case in-sensitive), where no space is embedded 
		//and Case of letter doesn't matter
		//Boolean is FALSE when String content is anything other than RULE 1 
		//Following Methods throw NumberFormatException(NFE): parseXXX(),parseXXX("101010",2), 
		//valueOf(), valueOf("67432",8)
		
		Byte b1 = new Byte((byte)12);
		//i1.compareTo(ii1); //Wrapper classes implement 'comparable' interface which 
		//uses default colonical order to compare the args
		System.out.println("Byte Max value:"+Byte.MAX_VALUE); //returns MAX value for that type
		System.out.println("Byte Max value:"+Byte.MIN_VALUE); //returns MIN value for that type
		System.out.println("Byte Size:"+Byte.SIZE); //returns size of bits used to represent number
		System.out.println("primitive type:"+Byte.TYPE); //returns primitive type
		System.out.println("Byte value : "+Byte.valueOf(b1));
		System.out.println("Byte value : "+Byte.valueOf("15"));
		System.out.println("----------------------------------------------------");
		
		Integer i1 = new Integer(12);
		i1.byteValue();
		i1.doubleValue(); //xxxValue() and parseXXX() returns primitive type where as ValueOf() returns wrapper type.
		
		i1.compareTo(ii1); //Wrapper classes implement 'comparable' interface which
		//uses default colonical order to compare the args
		System.out.println("Integer Max value:"+Integer.MAX_VALUE); //returns MAX value for that type
		System.out.println("Integer Max value:"+Integer.MIN_VALUE); //returns MIN value for that type
		System.out.println("Byte Size:"+Integer.SIZE); //returns size of bits used to represent number
		System.out.println("primitive type:"+Integer.TYPE); //returns primitive type
		System.out.println("Integer value : "+Integer.valueOf(i1));
		System.out.println("Integer value : "+Integer.valueOf("15"));
		System.out.println("Decode method "+Integer.decode("120"));
		System.out.println("parse method "+Integer.parseInt("100"));
		System.out.println("----------------------------------------------------");
	
		Float f1 = new Float("3.142f");
		System.out.println("float is infinite : "+f1.isInfinite());//returns if the number given is Infinite?
		System.out.println("float is Not A Number : "+f1.isNaN());//checks if the given number is Not A Number (NAN)
		System.out.println("float max exponent : "+Float.MAX_EXPONENT);
		System.out.println("float min exponent : "+Float.MIN_EXPONENT);
		System.out.println("float min value : "+Float.MIN_VALUE);
		System.out.println("float max value : "+Float.MAX_VALUE);
		System.out.println("float min normal : "+Float.MIN_NORMAL);
		System.out.println("float negative infinity : "+Float.NEGATIVE_INFINITY);
		System.out.println("float positive infinity : "+Float.POSITIVE_INFINITY);
		System.out.println("float Size(bits) : "+Float.SIZE);
		System.out.println("float : primitive Type : "+Float.TYPE);
		System.out.println("float parse string : "+Float.parseFloat("2.3452f"));
		System.out.println("float : valueOf float : "+Float.valueOf(3.12345F));
		System.out.println("float : valueOf String : "+Float.valueOf("31.2341f"));
		System.out.println("COMPARE function is ONLY in Float/Double:"+Float.compare(3.124f, 3.124F));
		System.out.println("----------------------------------------------------");
		
		Double d1 = new Double("3.142232323");
		System.out.println("DOUBLE functions are same as Float type"); 
		System.out.println("COMPARE function is ONLY available in Float/Double:"+Double.compare(3.124f, 3.124F));
		System.out.println("----------------------------------------------------");
		
		Character c1 = new Character((char)41);
		Character c2 = new Character('A');
		System.out.println("Characters Symbols value : example :"+c1.CURRENCY_SYMBOL);
		System.out.println("----------------------------------------------------");

//Boolean wrapper type : rule to determine TRUE and FALSE is, 
//RULE 1 : Boolean is TRUE : when String content is "true"(case IN-SENSITIVE), where no space is embedded 
//and Case of letter doesn't matter
//Boolean is FALSE when String content is anything other than RULE 1 

Boolean[] b2 = {new Boolean("True"),new Boolean("TRUE"),new Boolean("TrUe"),new Boolean("tRuE"),
				new Boolean("true"),new Boolean(" TRUE"),new Boolean("TRUE "),new Boolean("  TRUE"),
				new Boolean("TRAE"),new Boolean("FALSE "),new Boolean("FaLsE"),new Boolean("fALsE"),
				new Boolean(" fALsE"),new Boolean(" fALsE "),new Boolean("SUNIL"),new Boolean("SHETTY fALsE")};
		int i=0;
		for (Boolean b3 : b2){
			System.out.println((i+1)+" ::: "+b3);
			i++;
		}
		
		System.out.println("Characters Symbols value : example :"+c1.CURRENCY_SYMBOL);
		System.out.println("----------------------------------------------------");
	}
}
