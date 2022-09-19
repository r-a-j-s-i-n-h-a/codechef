import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            int count = 0, c = 0;
            while (n > 0) {
                int r = n % 10;
                if (r == 0)
                    c++;
                else {
                    list.add(r * (int) Math.pow(10, c));
                    count++;
                    c++;

                }
                n /= 10;
            }
            System.out.println(count);
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    }
