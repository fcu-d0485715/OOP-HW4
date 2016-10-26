package fcu.iecs.oop.tiida;

public class NissanTiida 
{
	static int num = 1;

	public void tiida() 
	{
		int a;
		int b;

		for (a = 0; a < num ; a ++) 
		{
			
		for (b = 0; b < num ; b ++) 
		{
			System.out.print("*");
		}
			System.out.print("\n");
		} 
		
		num ++;
	}

} 