/*

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****

*/
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
       for (int i=1; i<=n; i++){
            int spaces= n-i;
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
