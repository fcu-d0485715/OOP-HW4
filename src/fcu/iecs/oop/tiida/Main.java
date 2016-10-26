package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		NissanTiida nissantiida = new NissanTiida();

		Scanner scanner = new Scanner(System.in);

		int x,number = 0;
		System.out.printf("Please enter a number:");
		number = scanner.nextInt();
        for(x = 0 ; x < number ; x ++ )
        {
        	nissantiida.tiida();
        }
	}
} 