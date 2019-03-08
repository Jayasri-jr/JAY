import java.util.Scanner;
class multiplayer
{
  public static void main(String []args)
  {
  	Scanner ip=new Scanner(System.in);
   int i;
   int n=ip.nextInt();
    for(i=1; i<=5; ++i)
    {
      System.out.println(n*i+" ");
   }
  }
}
