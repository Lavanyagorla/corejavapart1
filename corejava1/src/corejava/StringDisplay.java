package corejava;

class parantclass
{
	public String s = "Ailaiah";
	public String Display()
	{
		return s;
	}
}
class Childclass extends parantclass
{
	public String Display()
	{
		System.out.println( super.Display ());
		return "lavanya";
	}

}

public class StringDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		System.out.println(obj.Display ());
	
				
			
				

	}

}

