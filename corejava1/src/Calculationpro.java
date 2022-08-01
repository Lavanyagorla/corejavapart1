import java.util.Scanner;

class Calculationpro {
void add(int a,int b)
{
	System.out.println("addition is---->"+(a+b));
}
void sub(int a,int b)
{
	System.out.println("subtraction is---->"+(a-b));
}
void mul(int a,int b)
{
	System.out.println("multiplication is---->"+(a*b));
}
void mod(int a,int b)
{
	System.out.println("modulo is---->"+(a%b));
}
}
class Arpro{

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Calculationpro f=new Calculationpro();
      Scanner s = new Scanner(System.in);
      System .out.println("enter a,b values operation");
      int a=s.nextInt();
      int b=s.nextInt();
      f.add(a, b);
      f.sub(a, b);
      f.mul(a, b);
      f.mod(a, b);
      System.out.println("enter two values + operation");
      int c =s.nextInt();
      int d=s.nextInt();
      f.add(c, d);
      System.out.println("enter two values + operation");
      int e=s.nextInt();
      int g=s.nextInt();
      f.sub(e, g);
      System.out.println("enter two values + operation");
      int h=s.nextInt();
      int i=s.nextInt();
      f.mul(h, i);
      System.out.println("enter two values + operation");
      int j=s.nextInt();
      int k=s.nextInt();
      f.add(j, k);
      System.out.println("enter two values + operation");
      int l=s.nextInt();
      int m=s.nextInt();
      f.add(l, m);

	}

}
