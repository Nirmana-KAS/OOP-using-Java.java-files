
package com.mycompany.prac03;

public class Prac03 {

    public static void main(String[] args) {
        Employee E1=new Employee(10000.00f);
        E1.setEname("Bogdan");
        System.out.println("Employee name:"+E1.getName());
        E1.setBSalary(50000);
        System.out.println("Basic salary:"+E1.getBSalary());
        E1.FindBonusAmount();
    }
}
