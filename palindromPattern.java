/*

    1
   212
  32123
 4321234
543212345

*/

import java.util.Scanner;

public class palindromPattern {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            int spaces= n-i;
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
