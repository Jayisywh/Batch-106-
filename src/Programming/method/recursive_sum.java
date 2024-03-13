package Programming.method;

import java.util.Scanner;

public class recursive_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the factorial number : ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.print("Sum of the number 1 to " + n + " is " + result);
    }

    public static int sum(int n) {
        // TODO Auto-generated method stub
        if (n == 1)
        return 1;
        else
        return n + sum(n - 1);
    }
}
