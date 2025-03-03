package core_java_programs;

interface Bicycle1 {
    public void applyBrake(); //unimplemented methods - jyna {} brackets nastat te
    public void speedUp();
    public void stand();
}

class AvonBicycle1 implements Bicycle1 {
    public void applyBrake() {
        System.out.println("Apply brake");
    }
    public void speedUp() {
        System.out.println("Speed up");
    }
    public void horn() {
        System.out.println("Tring Tring");
    }
    public void stand() {
        System.out.println("Stand");
    }
}
public class Interface {
    public static void main(String [] args) {
        AvonBicycle1 ab=new AvonBicycle1();
        ab.applyBrake();
        ab.speedUp();
        ab.horn();
        ab.stand();
    }
}
