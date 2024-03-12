/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
import java.util.Scanner;

public class HalfPyrawithNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
import java.util.Scanner;

public class HalfPyrawithNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

/*

1
22
333
4444
55555

*/

import java.util.Scanner;

public class HalfPyrawithNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for (int i=n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
