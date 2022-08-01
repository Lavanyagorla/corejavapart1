package corejava;

import java.util.Scanner;

public class Arrayprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // int[]age= {50, 25, 32, 4, 5};
      // System.out.println("accessing elements of array:");
      // System.out.println("first element:"+age[0]);
     //  for(int i=0;i<=age.length();i++)
     
    //  {
    	//  System.out.println(age[i]);
     //  }
		
	//	size of array
      Scanner scan=new Scanner(System.in);
      /* System.out.println("enter the size of array:");
       int n=scan.nextInt();
       int num[]=new int[n]; 
       System.out.println("enter array elements:");
       for(int i=0;i<n;i++)
       {
    	   num[i]=scan.nextInt();
    	   
       }
       System.out.println("array elements:");
       for(int i=0;i<n;i++)
       {
    	   System.out. println(num[i]);
       }*/
      
     // Names on array
      
      System.out.println("enter 5 names ");
      String name[]=new String[5];
      for (int i=0;i<name.length;i++)
      {
    	  name[i]=scan.nextLine();
    	  
      }
      System.out.println("name are ....");
      for(int i=0;i<name.length;i++)
      {
    	  System.out.println(name[i]);
      }
	}

}
