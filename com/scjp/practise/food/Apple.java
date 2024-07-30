package food;

public class Apple {
	//Instance variabels should be PRIVATE
	private String color;
	private String weight;
	
	//Instance methods should be PUBLIC
	public void setProperties(String cl, String wt){
		this.color = cl;
		this.weight = wt;
	} 
	
	public void display(){
		System.out.println("Color :"+color + " and weight is:  "+weight);
	}
}
