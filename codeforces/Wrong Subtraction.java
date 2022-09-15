import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            if(a%10==0){
                a=a/10;

            }
            else{
                a=a-1;

            }
        }
        System.out.println(a);
    }
    }
