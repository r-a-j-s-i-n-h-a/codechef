import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a-->0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((b+2)<=c){
                count++;
            }

        }
        System.out.println(count);

    }
    }
