package food;
//Access using : > creating an instance
//               > by inheriting 
class SmallBrinzal {
	String name; 
	public void setName (String nm){
		name=nm;
	}
}

class InheritBrinzal extends SmallBrinzal {
	public void displayMethod(){
		//Just to show accessing member using inheritance 
		setName("Green Brinzal");
		System.out.println("Brinzal name is : "+this.name);
	}
}

public class BigBrinzal {

	public static void main(String[] args) {
		//Just to show accessing member using reference. 
		SmallBrinzal s1 = new SmallBrinzal();
		s1.setName("Red Brinzal");
		System.out.println("Name of Brinzal is : "+s1.name);
		
		InheritBrinzal i1 = new InheritBrinzal();
		i1.displayMethod();
		
		InheritTheInherit it1 = new InheritTheInherit ();
		it1.setName("Red Chilli");
		it1.displayOut();
	}
}
//Just to show Name is accessible at 3 level of class
class InheritTheInherit extends InheritBrinzal {
	void displayOut(){
		System.out.println("I have access to name :"+name);
	}
}