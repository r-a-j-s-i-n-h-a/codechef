import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++){
            c=c+i*5;

            if(c+b>240){
                System.out.println(i-1);
                break;
            }
            if(c+b==240){
                System.out.println(i);
                break;
            }
        }
        if(c+b<240){
            System.out.println(a);
        }
    }
}
