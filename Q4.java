import java.util.*;
public class Q4
{
	public static void main(String[] args)
	{
		int i,num,x=0,sum=0,digits=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextInt();
		int orig=num;
		while(num>0)
		{
			digits++;
			num=num/10;
		}
		num=orig;
		while(num>0)
		{
			x=num%10;
			sum+=java.lang.Math.pow(x,digits);
			num=num/10;
		}
		if(sum==orig)
		System.out.println("Yes "+orig+" is Armstrong number");
		else
		System.out.println("Not Armstrong");
	}
}