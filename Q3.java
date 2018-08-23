import java.util.*;
public class Q3{
	public static void main(String[] x)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		n=sc.nextInt();
		System.out.println("Prime numbers are :");
		for(int i=2;i<=n;i++)
		{
			count=0;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
				System.out.println(i);
		}		
	}
}