import java.util.Scanner;

// https://atcoder.jp/contests/abc284/tasks/abc284_b
public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            int length = scan.nextInt();
            scan.nextLine();
            int count = 0;
            for (int j = 0; j < length; j++) {
                int num = scan.nextInt();
                if(num%2!=0){
                    count++;
                }
            }
            System.out.println("count = " +count);
            scan.nextLine();
        }
        scan.close();
    }
}
