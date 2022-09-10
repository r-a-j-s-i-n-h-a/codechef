import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int  row, col;
        int n;
        int step=0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                n = sc.nextInt();
                if (n == 1) {
                    row = Math.abs(i - 3);
                    col = Math.abs(j - 3);
                    step = row + col;
                }
            }

        }

        System.out.println(step);

    }
}

