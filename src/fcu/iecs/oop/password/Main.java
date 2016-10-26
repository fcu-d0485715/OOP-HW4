package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	
	{
		int x=0;
		String A;
		Scanner scanner = new Scanner(System.in);
		while(x == 0)
		{			
		System.out.println("Please enter a password:");
		A=scanner.nextLine();
		
		if(A.equals("exit"))
		{
			x = 1; 
			break;
		}
		
		else if(A.equals("EXIT"))
		{
			x = 1;
			break;
		}
		
		else{
		PasswordEncorder X=new PasswordEncorder();
		A=X.encode(A);
		System.out.println(A);
			}
		}
	}
}