import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<Character> h = new HashSet<Character>();
        char a='}';
        String b=sc.nextLine();
        for(int i=0;i<b.length();i++){
             char c = b.charAt(i);
            if (c == a) {

                break;
            }
            else if(c == '{' || c== ' ' || c==','){
                continue;
            }
            else{
                h.add(c);
            }
        }
        System.out.println(h.size());
    }
}
