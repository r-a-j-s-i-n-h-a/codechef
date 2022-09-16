import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      String b=sc.next();
      int counta=0;
      int countb=0;
      for(int i=0;i<a;i++){
          if(b.charAt(i)=='A'){
              counta++;
          }
          else{
              countb++;
          }
      }
      if(counta==countb){
          System.out.println("Friendship");
      }
      else if(counta>countb){
          System.out.println("Anton");
      }
      else{
          System.out.println("Danik");
      }
    }
    }
