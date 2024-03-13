package dataType;

import java.util.Scanner;

public class scanner_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter Name :");
System.out.print("Enter Your Age :");
int name=sc.nextInt();
int age=sc.nextInt();
String address=sc.nextLine();
System.out.print("Enter Your Address :");
;
System.out.println("Your Name is :" +name);
System.out.println("Your Agw is :" +age);
System.out.println("Your Address is :"+address);



	}

}
