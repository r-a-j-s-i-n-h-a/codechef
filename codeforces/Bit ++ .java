import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0;
        while(n-->0){
            String a=sc.next();
            if(a.equals("++X") || a.equals("X++")){
                count++;
            }
            else{
                count--;
            }
        }
    System.out.println(count);

    }
    }

