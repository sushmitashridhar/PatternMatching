package com.kodnest.project1;

public class Pattern7 {
	public static void main(String[] args) {
		int n=7;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(count<10)
				{
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
