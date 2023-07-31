
package com.mycompany.prac01que05;

public class Prac01Que05 {

    public static void main(String[] args) {
        char grade='A';
        switch(grade)
        {
           case 'A':
               System.out.println("Excellent");
               break;
           case'D':
               System.out.println("You passed");
               break;
           case'F':
               System.out.println("Better try again");
               break;
           default:System.out.println("Invalid grade");
        }
        System.out.println("Your grade is : "+grade);
    }
}
