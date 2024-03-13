package Programming;

import java.util.Scanner;



public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        double n1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        double n2 = sc.nextInt();
        addition (n1,n2);
        addition (3,4);
        sc.close();
    }
    public static void addition (double num1, double num2){
        double result = num1+num2;
        System.out.println("The sum of number 1 and number 2 is " +result);
    }
}
