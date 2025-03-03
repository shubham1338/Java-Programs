package core_java_programs;

public class GetterSetter {
    int rollno; //rollno=21
    String name;
    float marks;

    public void setRollno(int rollno) {
        this.rollno = rollno; //m1.rollno=21
    }

    public int getRollno() {
        return rollno; // return 21
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }

    public static void main(String args[]) {
        GetterSetter m1 = new GetterSetter();
        m1.setRollno(21);
        int r = m1.getRollno(); //int r=21
        System.out.print(r);
        m1.setName("Shubham");
        String s = m1.getName();
        System.out.print(s);
    }

}
