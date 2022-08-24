import java.util.*;
 
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[4];
        int c=0;
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
 
        }
        Arrays.sort(arr);
        for(int j=0;j<3;j++){
            if(arr[j]==arr[j+1]){
                c++;
            }
 
        }
        System.out.println(c);
    }
}
