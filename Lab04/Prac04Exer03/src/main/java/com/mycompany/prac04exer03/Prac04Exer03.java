
package com.mycompany.prac04exer03;

public class Prac04Exer03 {

    public static void main(String[] args) {
        Student S1=new Student(28973,"K.A.S.Nirmana","BSc (Hons) Computer Science - UGC");
        System.out.println("Student id: "+S1.getID());
        System.out.println("Student name: "+S1.getName());
        System.out.println("Student course: "+S1.getCourse());
        
        System.out.println();
        
        Lecturer L1=new Lecturer(111,"Mr.Mohomad Shafraz","Java Descripter");
        System.out.println("Lecturer id: "+L1.getID());
        System.out.println("Letcturer name: "+L1.getName());
        System.out.println("Lecturer programme: "+L1.getProgramme());
    }
}
