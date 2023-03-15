import java.util.Scanner;
import java.util.ArrayList;

// https://app.codility.com/c/run/training5UN9PS-QUR/
public class Q18 {
    // you can also use imports, for example:
    // import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");
    public static int solution(int N) {
        // Implement your solution here
        String num = Integer.toBinaryString(N);
        char[] list = num.toCharArray();
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i < list.length; i++) {
            if (list[i] == '1') {
                list1.add(i);
                System.out.println(i);
            }
        }
        
        int maxgap = 0;
        if (list1.size() <= 1) {
            return 0;
        } else {
            for (int i = 0; i < list1.size()-1; i++) {
                int result = list1.get(i + 1) - list1.get(i)-1;
                maxgap = Math.max(result, maxgap);
            }
            return maxgap;
        }
    }

    public static void main(String[] aStrings) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = solution(num);
        System.out.println(result);
    }
}