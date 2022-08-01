package corejava;

public class stringsb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Lavanya");
		int p=sb.capacity();
		int q=sb.length();
		System.out.println("capacity of string lavanya="+p);
		System.out.println("length of string lavanya="+q);
		sb.append("gorla");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);	
		sb.replace(1, 2," yadav");
		System.out.println(sb);


}
}
