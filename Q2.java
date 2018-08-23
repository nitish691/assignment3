import java.util.*;
public class Q2{
	public static void main(String[] x)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		n=sc.nextInt();
		System.out.println("Even numbers are :");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}		
	}
}