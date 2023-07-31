
package com.mycompany.prac03;

public class Employee {
    private String EmpName;
    private float BSalary;
    private float Bonus;
    private float BonusAmount;
    
    public void setEname(String ename)
    {
        this.EmpName=ename;        
    }
    public String getName()
    {
        return(EmpName);
    }
    public void setBSalary(float bsalary)
    {
        this.BSalary=bsalary;        
    }
    public float getBSalary()
    {
       return(BSalary);
    }
    public Employee(float  bonus)
    {
        this.Bonus=bonus;
    }
    public void FindBonusAmount()
    {
       BonusAmount=BSalary+Bonus; 
        System.out.println("Bonus Amount:"+BonusAmount);
    }
}

