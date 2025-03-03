package core_java_programs;

import java.util.*;
public class Constructor {
    int rollno;
    String name;
    float marks;

    //default
    Constructor() {
        rollno=1;
        name="Shubham";
        marks=4.5f;
    }

    //parameterized constructor
    Constructor(int rollno, String name, float marks) {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    public void display() {
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(marks);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
        String name=sc.next();
        float marks=sc.nextFloat();

        Constructor m1=new Constructor(rollno, name, marks);
        m1.display();

        Constructor m2=new Constructor();
        m2.display();
    }
}