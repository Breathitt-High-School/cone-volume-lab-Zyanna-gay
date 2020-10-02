import java.util.*;

public class ConeRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the radius :: " );
		int radius = kb.nextInt();
		System.out.print( "Enter the height :: " );		
		int height = kb.nextInt();
		double pi = 3.14159;
    System.out.println("Area :: "+(pi*radius*radius*height));
		//print your answer here
	}
}
