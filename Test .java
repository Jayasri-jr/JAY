import java.util.*;
 public class Test 
{ 
   
    public static void main(String[] args)  
    { 
        int fact= 1; 
   Scanner ip=new Scanner(System.in);
   int n=ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println( fact );
    } 
} 
