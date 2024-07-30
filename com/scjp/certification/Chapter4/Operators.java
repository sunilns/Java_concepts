package Chapter4;

interface testInterface {
	
}
class impleInter implements testInterface {
	
}

public class Operators {
	
	public static void main(String[] args){
		//'==' oprator RETRUNS true when integer is compared with float, double if value is same 
		System.out.println("5.0 == 5L   : "+(5.0 == 5L));
		System.out.println("5.0f == 5L   : "+(5.0f == 5L));
		System.out.println("5 == 5.0F   : "+(5 == 5.0F));
		System.out.println("5.0D == 5   : "+(5.0D == 5));
		
		//Conditional operators
		String status0 = (3<4)?"Pets count OK":(10>8)? "Enough of numbers" : "Pets count NOT OK";
		System.out.println("Status vaue is : "+status0);
		
		String status1 = (3>4)?"Pets count OK":(10>8)? "Enough of numbers" : "Pets count NOT OK";
		System.out.println("Status vaue is : "+status1);
		
		String status2 = (3<4)?(5>4)?"Five is greater":"4 is greater":(10>8)? "Enough of numbers" : "Pets count NOT OK";
		System.out.println("Status vaue is : "+status2);
		
		String status3 = (3<4)?(5<4)?"Five is greater":"4 is greater":(10>8)? "Enough of numbers" : "Pets count NOT OK";
		System.out.println("Status vaue is : "+status3);
		
		//Bitwise Operators (& , | ) USED AS Logical Operators. these are NOT Short-Circuit ops 
		//They evaluate both side of operators. 
		int z =5;
		if(++z >5 || ++z > 6){ //SHORT CIRCUIT operator ||( one more is &&)
			z++;
			System.out.println("Z value is || : "+z);
		}
		
		z=5;
		if(++z > 5 & ++z < 6){ //NON-SHORT CIRCUIT operator | (one more is &)
			z++;
			System.out.println("Z value & is : "+z);
		}
		
		//^ operator also evaluates both operands and for expression to be true EXACTLY
		//One operand must be true.
		z=5;
		if((++z > 5)^(++z < 6)){ //NON-SHORT CIRCUIT operator ^. EXACLY one test must be true 
			z++;
			System.out.println("Z value is ^ : "+z);
		}
		
		testInterface i1 = new impleInter();
		impleInter c1 = new impleInter();
		System.out.println("Interface instanceof Class : "+ (c1 instanceof impleInter));
		System.out.println("Interface instanceof Class : "+ (c1 instanceof testInterface));
		System.out.println("Interface instanceof Class : "+ (i1 instanceof impleInter));
		System.out.println("Interface instanceof Class : "+ (i1 instanceof testInterface));		
	}
}