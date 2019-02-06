import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int a;
     Scanner S= new Scanner(System.in);
      System.out.println(" ");
      a=S.nextInt();
      if(a>0)
        {
        System.out.println("positive");
      }
        else
        if(a==0)
        {
            System.out.println("zero");
        }
       else
       {
       	System.out.println("negative");
        }
    }
}
