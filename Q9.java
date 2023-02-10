
// https://atcoder.jp/contests/abc285/tasks/abc285_a
import java.util.Scanner;;

public class Q9 {
    public static void main(String[] arStrings) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if ((b == a * 2) || (b == a * 2 + 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
