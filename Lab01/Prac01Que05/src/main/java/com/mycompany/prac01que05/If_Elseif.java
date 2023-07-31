
package com.mycompany.prac01que05;

public class If_Elseif {
    char Grade = 'A';

    if (Grade == 'A') {
        System.out.println("Excellent!");
    }
    
    else if (Grade == 'D') {
        System.out.println("You passed");
    } 
    
    else if (Grade == 'F') {
        System.out.println("Better try again");
    } 
    
    else {
        System.out.println("Invalid grade");
    }

    System.out.println("Your grade is " + Grade);

}
