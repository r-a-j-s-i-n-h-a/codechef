import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while(n-->0){
            int num = sc.nextInt();
            if((5-num)>=k){
                count++;
            }
        }
        System.out.println(count/3);
    }
}
