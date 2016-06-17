package access_modifiers;

class Bcd
{
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;         //this.name is the class variable nd name is the argument passed
		                                   //from other class
	}
}

public class Private_modifier {

	public static void main(String[] args) {
		
       Bcd obj= new Bcd();
       obj.setName("yash");
       System.out.println(obj.getName());
	}
}
// private variables can only be accessed only by getters n setters otherwise can't be accessed