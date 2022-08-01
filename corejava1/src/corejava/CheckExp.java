package corejava;
class namelength extends Exception
{
	public String toString() {
		return "you have not enter either first or second name";
	}
}

public class CheckExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gorla";
		String s2="lavanya";
		try {
			if(s1==null&&s2==null) {
				throw new namelength();
			}
			else
				System.out.println(s1+" "+s2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
