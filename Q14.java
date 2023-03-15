
// https://atcoder.jp/contests/abc275/tasks/abc275_a
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int max = Integer.MIN_VALUE;
        int index = 1;
        for (int i = 1; i < N + 1; i++) {
            int num = scan.nextInt();
            if (num > max) {
                max = num;
                index = i;
            }
        }
        scan.close();
        System.out.println(index);
    }
}
