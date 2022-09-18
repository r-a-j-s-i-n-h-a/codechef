import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count =0;
        int [ ] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                count ++;
            }
            else{
                count --;
            }
        }
        if(count==a){
            System.out.println("EASY");
        }
        else{
            System.out.println("HARD");
        }
    }
    }
