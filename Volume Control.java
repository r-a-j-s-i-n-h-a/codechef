import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test!=0){
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if(X<Y){
         System.out.println(Y-X);
    }
    else{
    System.out.println(X-Y);
    }
    test--;
    }



		// your code goes here
	}
}
