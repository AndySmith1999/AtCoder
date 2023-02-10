import java.util.Scanner;

// https://atcoder.jp/contests/abc284/tasks/abc284_a
public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = scan.nextLine();
        }
        for(int i = N-1; i>=0;i--){
            System.out.println(list[i]);
        }
        scan.close();
    }
}
