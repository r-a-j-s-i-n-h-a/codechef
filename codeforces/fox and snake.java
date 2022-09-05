import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
//        int arr1[]=new int[a];
//        int arr2[]=new int[b];
        int count=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0)
            {
                for(int j=1;j<b;j++){
                    System.out.print("#");
                }
                System.out.println("#");
            }
            else{
                if(count==0){
                    for(int j=1;j<b;j++){
                        System.out.print(".");
                    }
                    System.out.println("#");
                    count++;
                }
                else{
                    System.out.print("#");
                    for(int j=2;j<b;j++){
                        System.out.print(".");
                    }
                    System.out.println(".");
                    count--;
                }
            }

        }
    }
}
