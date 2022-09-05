import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int count =0;
        int count2 =0;
        int arr[]=new int[a];
        for(int j=0 ;j<a;j++){
            arr[j]=sc.nextInt();
        }
            int maxx=arr[0];
            int minn=arr[0];
            for(int i=0;i<a;i++){
                if(arr[i]>maxx){
                    maxx=arr[i];
                    count++;
                }
                if(arr[i]<minn){
                    minn=arr[i];
                    count++;
                }
            }
            System.out.println(count);
    }
}
