package Programming.method;

import java.util.Scanner;

public class sum_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 =  sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        sum(num1, num2);
        sum(105, 106);
        sum(3,4,5);
        sc.close();
    }
    public static void sum(int i, int j, int k) {
        System.out.print("Sum of the numbers : " + (i+j+k));
    }
    public static void sum(int n1, int n2) {
        System.out.print("Sum of the numbers = " +(n1+n2));
    }
}
