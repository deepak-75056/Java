/*
*Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
*/

import java.util.Scanner;
public class ReverseNumberPattern12 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		// System.out.println("");
		for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
                System.out.print(i-j+1);
        }
        System.out.println();
        }
    }
}



