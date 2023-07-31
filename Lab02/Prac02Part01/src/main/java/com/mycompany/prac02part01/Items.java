
package com.mycompany.prac02part01;

public class Items {
     private int location;
    private String description;
    
    public Items(int loc,String des)
    {
        this.location=loc;
        this.description=des;
    }
    public void getter()
    {
        System.out.println("Location: " +location);
        System.out.println("Description: " +description);
    }
}
