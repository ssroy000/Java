import java.util.Scanner;

class Solution {
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int k = 0;
        int temp = Math.abs(num);  // Handle negative numbers
        
        if (temp == 0) {
            k = 1;  // Special case for 0
        } else {
            while (temp > 0) {
                temp /= 10;
                k++;
            }
        }

        temp = Math.abs(num);  // Reset temp before using it again
        
        while (temp > 0) {
            int id = temp % 10;
            sum += Math.pow(id, k);
            temp = temp / 10;
        }

        return sum == Math.abs(num);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (Solution.isArmstrong(n)) {  // <--- call using class name
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
