import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        for (int i=0;i<9000;i++){
            s=String.valueOf(Integer.parseInt(s)+1);
           if(s.charAt(0)!=s.charAt(1) && s.charAt(0)!=s.charAt(2) && s.charAt(0)!=s.charAt(3) && s.charAt(1)!=s.charAt(2) && s.charAt(1)!= s.charAt(3)&& s.charAt(2)!=s.charAt(3)){
               System.out.println(s);
               break;
           }

        }


    }
    }
