import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int s = sc.nextInt();
            int arr[] = new int[s];
            for(int i =0;i<s;i++){
                arr[i] = sc.nextInt();
            }
            Boolean bool = true;
            Arrays.sort(arr);
            for(int i =0;i<s-1;i++){
                if((arr[i+1]-arr[i])>1){
                    bool = false;
                    break;
                }
            }
            if(bool==true){
                System.out.println("YES");
            }
            else{
                 System.out.println("NO");
            }
        }
    }
}
