import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int a;
        int b=0;
        for(int i=1;i<=w;i++){
            a=k*i;
            b=b+a;
        }

        if(n>=b){
            System.out.println(0);
        }
        else {
            System.out.println(b-n);
        }
    }
}
