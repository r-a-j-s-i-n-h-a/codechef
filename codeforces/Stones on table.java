import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int t=sc.nextInt();
        String s=sc.next();
        int count=0;
        for(int i=0;i<t-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
