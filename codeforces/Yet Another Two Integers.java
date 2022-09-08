import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b){
                int d=a-b;
                if(d%10==0){
                    count=d/10;
                }
                else{
                    count=d/10 + 1;
                }

                }
            else if(a==b){
                count =0;
            }
            else{
                if (a<b){
                    int d=b-a;
                    if(d%10==0){
                        count=d/10;
                    }
                    else{
                        count=d/10 + 1;
                    }
                }
            }
            System.out.println(count);
            }

        }
    }
