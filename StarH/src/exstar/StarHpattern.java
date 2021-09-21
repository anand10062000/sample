package exstar;

import java.util.Scanner;

public class StarHpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j==1 || j==n || i==(n/2)+1)
					System.out.print("*");
				else
					System.out.print(" ");
				
					
				}
			System.out.println();
			}
		}

	}


