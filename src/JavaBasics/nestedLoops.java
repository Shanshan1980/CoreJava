package JavaBasics;

public class nestedLoops {

	public static void main(String[] args) {
		//nested loops works -outer for loop this block will loop for 4 times
		for(int i=1;i<=4;i++)
		{
			System.out.println("outer loop started");
			//nested loops works for 4 times-4x4times
			for(int j=1;j<=4;j++)
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}
		
//		1	2	3	4	
//		5	6	7	
//		8	9	
//		10
		int k=1;
		for(int i=0;i<4;i++) 
		{
		//System.out.println( "outer loop started");
		for(int j=1;j<=4-i;j++) // inner loop
		{
		System.out.print( k);
		System.out.print("\t");
		k++;
		}
		System.out.println( "");
		}
		
//		1	
//		1	2	
//		1	2	3	
//		1	2	3	4	
		for(int i=1;i<5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		System.out.print("\t");
		//k++;
		}
		System.out.println("");
		}
		}

	}


