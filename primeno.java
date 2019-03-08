import java.util.Scanner;
class primeno
{
	public static void main(String []agrs)
	{
		int flag=0,i;
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		if(n<=1000)
		{
		for(i=0;i<n/2;i++)
		{
			if(n%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		
			System.out.println("yes");
		
		else
			System.out.println("no");
	}
	else
			System.out.println("no");
	}
}
