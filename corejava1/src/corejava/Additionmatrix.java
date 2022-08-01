package corejava;

import java.util.Scanner;

public class Additionmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first  matrix data");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter second matrix data");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("first matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.print("\n");
		
		
		}
	
		System.out.println("second matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.print(" ");
				
		}
		System.out.println("sum of two matrix \n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]+" ");
			}
			System.out.print(" ");
		}

	}

}
