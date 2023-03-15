// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Q19 {
    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int len = A.length;
        if(len == 0){
            return null;
        }
        K = K % len;
        if(K == 0){
            return A;
        }
        int [] arr = new int[2*len];
        int [] result = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = arr[i+len] = A[i];
        }

        for(int i = 0; i < len; i++){
            result[i] = arr[len-K+i];
        }

        return result;
    }
    public static void main(String[] aStrings){
        int [] A = {5, -1000};
        int K = 1;
        int [] result = solution(A, K);
        for(int i = 0 ;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}