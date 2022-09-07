import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int count2=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<a;i++){
            if(arr[i]>0){
                count = count +arr[i];

                }
            else if(arr[i]<0){
                count = count + arr[i];
                if(count<0){
                    count2 = count2 + 1;
                    count=0;
                }
            }
            }


        System.out.println(count2);

    }
}
