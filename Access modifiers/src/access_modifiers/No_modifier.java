package access_modifiers;

class Abc
{
	int age;
	String name;
	
	public Abc(String name)
	{
		System.out.println(name);
	}
}

public class No_modifier {

	public static void main(String[] args)
	{
		Abc obj =new Abc("Yash");
		//obj.name="yash";
		
	}
}
		// as variables have no specific modifiers so it can be accessed from other class