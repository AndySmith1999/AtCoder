import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        char[] list = num.toCharArray();
        for (char i : list) {
            switch (i) {
                case '0':
                    System.out.print("1");
                    break;
                case '1':
                    System.out.print("0");
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}

