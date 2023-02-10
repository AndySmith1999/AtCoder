import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String s = scan.next();
        char[] list = s.toCharArray();
        int i = 0;
        while (i < length) {
            if ((i < length - 1) && (list[i] == 'n') && (list[i + 1] == 'a')) {
                System.out.print("nya");
                i += 2;
            } else {
                System.out.print(list[i]);
                i++;
            }
        }
        scan.close();
    }
}
