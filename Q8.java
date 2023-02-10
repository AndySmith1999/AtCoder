// https://atcoder.jp/contests/abc285/tasks/abc285_b
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String s = scan.next();        
        char[] list = s.toCharArray();
        for (int i = 1; i < N; i++) {
            int l = 0;
            for (int j = 0; j + i < N; j++) {
                if (list[j] == list[j+i]) {
                    break;
                } else {
                    l++;
                }
            }
            System.out.println(l);
        }
        scan.close();
    }

}
