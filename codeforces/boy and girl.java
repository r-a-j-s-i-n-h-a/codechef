import java.util.*;
public class main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      HashSet<Character> hs= new HashSet<Character>();
      String s = sc.nextLine();
      for(int i=0;i<s.length();i++){
          char a= s.charAt(i);
          hs.add(a);
      }
      if(hs.size()%2==0){
          System.out.println("CHAT WITH HER!");
      }
      else{
          System.out.println("IGNORE HIM!");
      }
    }
}
