/*
 * You are given a simple undirected graph with 
N vertices and 
M edges. The vertices are numbered 
1,2,…,N, and the edges are numbered 
1,2,…,M.
Edge 
i(i=1,2,…,M) connects vertices 
u 
i
​
  and 
v 
i
​
 .

Determine if this graph is a path graph.

What is a simple undirected graph?
A simple undirected graph is a graph without self-loops or multiple edges whose edges do not have a direction.
What is a path graph?
A graph with 
N vertices numbered 
1,2,…,N is said to be a path graph if and only if there is a sequence 
(v 
1
​
 ,v 
2
​
 ,…,v 
N
​
 ) that is a permutation of 
(1,2,…,N) and satisfies the following conditions:
For all 
i=1,2,…,N−1, there is an edge connecting vertices 
v 
i
​
  and 
v 
i+1
​
 .
If integers 
i and 
j satisfies 
1≤i,j≤N and 
∣i−j∣≥2, then there is no edge that connects vertices 
v 
i
​
  and 
v 
j
​
 .
 */

// vertice N, edges M
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        int Q = scan.nextInt();
        int R = scan.nextInt();
        int[] list = new int[N];
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < Q - P + 1; i++) {
            int temp = list[P - 1 + i];
            list[P - 1 + i] = list[R - 1 + i];
            list[R - 1 + i] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(list[i] + " ");
        }
        scan.close();
    }
}
