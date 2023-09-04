/*
 * Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
 */

 
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();

        System.out.println("*");
//        Loop 1
        for (int i=1;i<=jj;i++){
            System.out.print("*");

            for(int p=1;p<=i;p++){
                System.out.print(p);
            }
            for (int j=1;j<i;j++){
                System.out.print(i-j);
            }
            System.out.println("*");
        }

//        Loop 2
        for (int u=1;u<jj;u++){
            System.out.print("*");


            for(int r=1;r<=jj-u;r++){
                System.out.print(r);
            }
            for (int e=1;e<jj-u;e++){
                System.out.print(jj-e-u);

            }
            System.out.println("*");
        }
        System.out.print("*");
        
    }
}

