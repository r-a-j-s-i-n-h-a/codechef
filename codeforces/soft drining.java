import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int p=sc.nextInt();
            int nl=sc.nextInt();
            int np=sc.nextInt();
            int a= k*l;
            int b=a/nl;
            int a2=c*d;
            int a3=p/np;
            System.out.println(Math.min(a3,Math.min(b,a2))/n);


    }
}
