package All;

import java.util.Scanner;

class Prime
{
	public static void main(String arg[])	
	{
	int i,count;
    System.out.print("Enter start and end value : ");
	Scanner sc=new Scanner(System.in);
	int n2=sc.nextInt();
	int n=sc.nextInt();
    System.out.println("Prime numbers between "+n2+" to "+n+" are ");
	for(int j=n2;j<=n;j++)
	{
		count=0;
		for(i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;        
			}
		}
		if(count==2)
	    System.out.print(j+"  ");
	}
}

}