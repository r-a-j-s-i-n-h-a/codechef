import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=Math.abs(a-c) + Math.abs(b-c)   ;
        int e=Math.abs(b-a) + Math.abs(c-a)   ;
        int f=Math.abs(a-b) + Math.abs(c-b);
 
 
 
        System.out.println(Math.min((Math.min(d,e)),f));
 
    }
}
