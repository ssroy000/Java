/*

Example:
Input: ‘N’ = 3

Output: 

*****
 ***
  *

*/

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i=n; i>0; i--){
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
