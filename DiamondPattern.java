/*

   *
  ***
 *****
*******
*******
 *****
  ***
   *

  */

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
      //upper part
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
           int stars=2*i-1;
            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      //lower part
        for (int i = n; i >0; i--) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int stars=2*i-1;
            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
