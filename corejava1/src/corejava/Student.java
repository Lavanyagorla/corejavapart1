package corejava;

import java.util.Scanner;

 class Student {


		// TODO Auto-generated method stub
		String name;
		int roll_no;
		void display(String name, int roll_no)
		{
			System.out.println("name:"+name+"\n"+"roll_no:"+roll_no);
			
		}
		

	
 }
	class Stumain{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the name:");
	String name=scan.nextLine();
	System.out.println("enter the roll_no:");
	int roll_no =scan.nextInt();
	Student s=new Student();
	s.display(name,roll_no);
	}

	}


