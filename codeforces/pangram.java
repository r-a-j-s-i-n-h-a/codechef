public class main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        str = str.toLowerCase();
 
        if(n>=26){
            HashSet<Character> set = new HashSet<Character>();
            for(int i =0;i<n;i++){
                set.add(str.charAt(i));
            }
            int m = set.size();
            if(m==26){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
 
        else{
            System.out.println("NO");
        }
    }
}
