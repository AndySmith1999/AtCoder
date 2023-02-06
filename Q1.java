import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // System.out.println("Please enter 3 nums.");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        switch (A) {
            case 5:
                if (((B == 5) && (C == 7)) || ((B == 7) && (C == 5))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            case 7:
                if ((B == 5) && (C == 5)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;

            default:
                System.out.println("NO");
        }
        scan.close();
    }
}
