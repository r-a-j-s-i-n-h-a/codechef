import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b =sc.nextInt();
            if(b%2==0){
                b=(b/2)-1;
                System.out.println(b);
            }
            else{
                b=b/2;
                System.out.println(b);
            }
        }
 
    }
}
