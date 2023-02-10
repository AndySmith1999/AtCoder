
/*
 * You are given 
N strings of length six each, consisting of digits. Let 
S 
i
​
  be the 
i-th 
(i=1,2,…,N) of them.

You are also given 
M strings of length three each, consisting of digits. Let 
T 
j
​
  be the 
j-th 
(j=1,2,…,M) of them.

Find the number of strings among 
S 
1
​
 ,S 
2
​
 ,…,S 
N
​
  whose last three characters coincide with one or more of 
T 
1
​
 ,T 
2
​
 ,…,T 
M
​
 .
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        ArrayList<String> post = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            post.add(scan.next().substring(3));
            scan.nextLine();
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < y; i++) {
            String text = scan.next();
            if (map.get(text) == null) {
                map.put(text, 1);
            } 
            // else {
            //     Integer n = map.get(text);
            //     n++;
            //     map.put(text, n);
            // }
        }
        int count = 0;
        for (int i = 0; i < post.size(); i++) {
            if (map.containsKey(post.get(i))) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
