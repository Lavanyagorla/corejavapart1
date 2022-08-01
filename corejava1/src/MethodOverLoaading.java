
public class MethodOverLoaading {
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
		void sum(double a, double b)
		{
			System.out.println(a+b);
		}
		void sum(float a,float b)
		{
			System.out.println(a+b);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoaading obj = new MethodOverLoaading();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10.5, 10.5);
		obj.sum(5.5, 1.5);
	

	}

}
