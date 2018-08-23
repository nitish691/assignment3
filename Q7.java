import java.util.*;
public class Q7{
	public static void main(String[] x)
	{
		int arr[]=new int[]{1,4,6,7,8,9,10};
		int i,num,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextInt();
		for(i=0;i<7;i++)
		{
			if(num==arr[i])
			{
				flag=1;;
			}
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}