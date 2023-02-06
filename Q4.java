/*
 * Problem Statement
There are 
N people. Each of them agrees or disagrees with a proposal. Here, 
N is an odd number.

The 
i-th 
(i=1,2,…,N) person's opinion is represented by a string 
S 
i
​
 : the person agrees if 
S 
i
​
 = For and disagrees if 
S 
i
​
 = Against.

Determine whether the majority agrees with the proposal.
 * 
 * 
 */
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int yes = 0, no = 0;
        for(int i = 0; i < total; i++){
            String opin = scan.nextLine();
            switch(opin){
                case "For":
                yes++;
                break;
                default:
                no++;
            }
            if(yes == total/2+1){
                System.out.println("Yes");
                break;
            }else if(no == total/2+1){
                System.out.println("No");
                break;
            }
        }

    }
}
