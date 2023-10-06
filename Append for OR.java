/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner (System.in);
		int a=sc.nextInt();
		
	
		
		while(a-->0){
		    int first=sc.nextInt();
		    int second=sc.nextInt();
		    int ofset[]=new int[first];
		    for(int i=0;i<first;i++){
		        ofset[i]=sc.nextInt();
		    }
		    //for each or
		   	int frame=0;
		     int n=ofset.length;
		    for(int i=0;i<n;i++){
		        frame=frame|ofset[i];
		    }
		    //for value of x
		    int c=0;
		    for(int j=0;j<=second;j++){
		        if((j|frame)==second){
		            System.out.println(j);
		            c++;
		            break;
		        }
		    }
		    if(c==0){
		        System.out.println(-1);
		    }
		    
		}
	}
}
