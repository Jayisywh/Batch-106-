package  Programming.method;

import java.util.Scanner;

public class ten_students_mark {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student numbers : ");
               int size=sc.nextInt();
               int a[]=new int[size];
               int sum=0;
               for(int i=0; i<size; i++)
               {
                   System.out.print("Enter student marks : ");
                     a[i] = sc.nextInt();
                    sum+=a[i];
   
               }double avg=sum/a.length;
               System.out.println("Average mark : "+avg);
               int above=0;
               int below=0;
               for(int i=0;i<size;i++) 
               {
                   if(a[i]>avg) 
                   {
                       above++;
                   }
   
                   else
                   {
                       below++;
                   }
   
   
               }System.out.println(above+" students are above average");
               System.out.println(below+" students are below average");
   
   
   
   
       }
   
   }