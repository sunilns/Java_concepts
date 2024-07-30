package experiment;

public class StringStringbufferStringbuilder {
	
	public static void main(String[] args) {
		String s1 = "AunilA";
		Character c1 = s1.concat("Shetty").substring(5, 8).charAt(0);
		
		System.out.println("Character Is :"+c1);
		System.out.println("Character Position is :"+s1.indexOf('A', 0));
		System.out.println("Replaced sequence is :"+s1.replace("uni", "nop").substring(1, 4));
		System.out.println("Last Index of :"+s1.lastIndexOf('A', 4));
		System.out.println("Last Index of :"+s1.lastIndexOf('A', 5));  //LastIndexOf function searches Backward from specified Index
		
		StringBuffer sb1 = new StringBuffer("Bangalore ");
		System.out.println("Capacity is : 1 : "+sb1.capacity());
		sb1.append("City");
		System.out.println("Capacity is : 2 : "+sb1.capacity());
		sb1.insert(9, " Clean");
		System.out.println("String is : "+sb1); 
		System.out.println("Capacity is : 3 : "+sb1.capacity());
		System.out.println("After replace : "+sb1.replace(9, 15, " Dirty"));
		System.out.println("After Insert : "+sb1.insert(0, false));
		System.out.println("After Insert : "+sb1.insert(0, true));
		System.out.println("Substring : "+sb1.substring(4, 9));
		System.out.println("Content is : "+sb1.toString());	
	}

}
