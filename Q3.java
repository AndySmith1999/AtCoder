import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        for(int i = 0; i < length; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
            scan.nextLine();
        }
        scan.close();
    }
}
