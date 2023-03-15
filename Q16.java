import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// import java.util.Scanner;
// import java.util.Arrays;

// public class Q16 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         scan.nextLine();
//         long[] list = new long[N];
//         for (int i = 0; i < N; i++) {
//             list[i] = scan.nextLong();
//         }
//         scan.close();
//         if(N==2){
//             if(isEven(list[0]+list[1])){
//                 System.out.println(list[0]+list[1]);
//                 System.exit(0);
//             }else{
//                 System.out.println("-1");
//                 System.exit(0);
//             }
//         }
//         Arrays.sort(list);
//         for (int i = N - 1; i > 0; i--) {
//             for(int j = i-1;j>=0;j--){
//                 if(isEven(list[i]+list[j])){
//                     System.out.println(list[i]+list[j]);
//                     System.exit(0);
//                 }
//             }
//         }
//         System.out.println("-1");
//     }

//     public static boolean isEven(long num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

public class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Long> odd = new ArrayList<>();
        ArrayList<Long> even = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long num = scan.nextLong();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        scan.close();
        Collections.sort(even);
        Collections.sort(odd);

        long evenresult = -1;
        long oddresult = -1;
        if (even.size() > 1) {
            evenresult = even.get(even.size() - 1) + even.get(even.size() - 2);
        }
        if(odd.size() >1){
            oddresult = odd.get(odd.size() -1) + odd.get(odd.size() - 2);
        }

        System.out.println(Math.max(evenresult, oddresult));
    }
}