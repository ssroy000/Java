/*
     *****
    *****
   *****
  *****
 *****

*/

public class solidRhombus {
    public static void main(String[] args){
        int n=5;
        int num=n;
        for (int i=num; i>0; i--){
            for (int j=num; j>0; j--){
                System.out.print(" ");
            }
            for (int j=n; j>0; j--){
                System.out.print("*");
            }
            num--;
            System.out.println();
        }
    }
}
