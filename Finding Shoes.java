import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T!=0){
	        int N= sc.nextInt();
	        int M= sc.nextInt();
	        if(N<=M){
	            System.out.println(N);
	        }
	        else if(M==0){
	            System.out.println(N*2);
	        }
	        else{
	            int a=N-M;
	            System.out.println(N+a);
	        }
	        T--;
	        
	    }
		// your code goes here
	}
}
