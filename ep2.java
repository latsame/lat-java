// Java Program to Print Multiplication Table

import java.util.Scanner;

public class ep2 {
    
    private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	

		MultiTable(number);
	}
	
	public static void MultiTable(int num)
	{
		int i, j;
		
		for(i = num; i < 10; i++)
		{
			for(j = 2; j <= 9; j++)
			{
				System.out.println(i +"  *  " + j + "  =  " + i * j);
			}
			System.out.println("================");
		}
	}
}

