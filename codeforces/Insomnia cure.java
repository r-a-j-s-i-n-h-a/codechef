import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count =0;
        if(k==1){
            System.out.println(d);
        }
        else{
            for(int i=d ; i>=1 ;i--){
                if(i%k==0 || i%l==0 || i%m==0 || i%n==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
