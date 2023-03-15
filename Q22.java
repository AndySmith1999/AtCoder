import java.util.Scanner;
import java.util.HashMap;
public class Q22{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String s = scan.nextLine();
        String[] list = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= num; i++){
            map.put(Integer.toString(i), 1);
        }

    }
}