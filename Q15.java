import java.util.Scanner;

// https://atcoder.jp/contests/abc275/tasks/abc275_b
public class Q15 {
    public static void main(String[] aStrings) {
        Scanner scan = new Scanner(System.in);
        long num = 998244353;
        long A = scan.nextLong()%num;
        long B = scan.nextLong()%num;
        long C = scan.nextLong()%num;
        long D = scan.nextLong()%num;
        long E = scan.nextLong()%num;
        long F = scan.nextLong()%num;
        long sum = (((A*B)%num)*C)%num-(((D*E)%num)*F)%num;
        if(sum < 0){
            System.out.println(num+sum);
        }else{
            System.out.println(sum);
        }
        scan.close();

    }
}
