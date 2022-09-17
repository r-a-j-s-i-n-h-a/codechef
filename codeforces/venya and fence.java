import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[]=new int[a];
        int width =0;
        for(int i=0;i<a;i++){
            c[i]=sc.nextInt();
            if(c[i]>b){
                width+=2;
            }
            else{
                width++;
            }
        }
        System.out.println(width);

    }
    }
