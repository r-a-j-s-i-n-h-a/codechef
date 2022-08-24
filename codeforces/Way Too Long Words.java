import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a= sc.next();
            if(a.length()<=10){
                System.out.println(a);
            }
            else{
                int b=a.length();
                System.out.println(a.charAt(0)+""+(b-2)+""+a.charAt(b-1));
            }
 
 
        }
 
 
 
 
    }
}
