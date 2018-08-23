import java.util.*;
public class Q5
{
	public static void main(String[] x)
	{
		int i,num,sum=0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextInt();
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.print("Reverse of number is :"+rev);
	}
}