import java.util.Scanner;

// https://atcoder.jp/contests/abc293/tasks/abc293_a
public class Q21{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        char[] list = S.toCharArray();

        for(int i = 0; i <= list.length-2; i+=2){
            // swap(list[i], list[i+1]);
            char temp = list[i]; 
            list[i] = list[i+1];
            list[i+1] = temp;
            System.out.printf("%s%s",list[i],list[i+1]);
        }
    }
}