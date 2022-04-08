/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int M=sc.nextInt();
		  //  for(int i=0;i<M;i++){
		  //      X=X+X;
		  //  }
		  int C=X*M;
		    if(C<Y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	    }
	    catch(Exception e){
	        
	    }
	}
}
