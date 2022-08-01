package corejava;

import java.util.Scanner;

public class matrixprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				a[i][j]=scan.nextInt();
				
			}	
			}
		
			System.out.println("matrix:ln");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

		
	
	
					
			
				}
	
	}	
		
		

	
	

