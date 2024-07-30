package Flowers;

//To show Difference between : Public, Default, Protected and private
public class SuperFruit {
	private String privateName;
	String defaultName;
	protected String protectedName;
	public String publicName;
	
	public void setMembers(){
		privateName="private";
		defaultName="default";
		protectedName="protected";
		publicName="public";
	}
	
	void localMethod(){
		System.out.println("Local private member is:"+privateName);
	}
}
