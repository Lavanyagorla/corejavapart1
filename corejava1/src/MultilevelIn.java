
class A
{
	int a,b,c;
	void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("sum of two numbers:"+c);
	}
}
class B extends A
{
	void sub()
	{
		a=50;b=40;
		c=a-b;
		System.out.println("sub of two numbers:"+c);
	}
	void multi()
	
	{
		a=60;b=50;
		c=a*b;
		System.out.println("multiplication of two numbers:"+c);
	}
}
class C extends B
{
	void div()
	{
		a=90;b=2;
		c=a/b;
		System.out.println("division of two numbers:"+c);
		
		
		
	}

}
public class MultilevelIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C r=new C();
r.add(); r.sub(); r.multi(); r.div();
	}
}


