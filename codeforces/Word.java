import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int  count =0;
        int count2=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96) {
                count++;
            }
            else{
                count2++;
            }

        }
        if(count>=count2){
            s=s.toLowerCase();
            System.out.println(s);
        }
        else{
            s=s.toUpperCase();
            System.out.println(s);
        }
    }
}
