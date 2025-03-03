package core_java_programs;

interface Bicycle {
    public void applyBrake(); //unimplemented methods - jyna {} brackets nastat te
    public void speedUp();
    public void stand();
    private void dalan() {
        System.out.println("Taking dalan");
    }
    default public void carrier() {
        dalan();
        System.out.println("Carrier for all Bicycles");
    }
}

class HeroBicycle implements Bicycle {
    public void applyBrake() {
        System.out.println("Apply brake for HeroBicycle");
    }
    public void speedUp() {
        System.out.println("Speed up for HeroBicycle");
    }
    public void stand() {
        System.out.println("Stand for HeroBicycle");
    }
    public void carrier() {
        System.out.println("Carrier for HeroBicycle");
    }
}

class AvonBicycle implements Bicycle {
    public void applyBrake() {
        System.out.println("Apply brake for AvonBicycle");
    }
    public void speedUp() {
        System.out.println("Speed up for AvonBicycle");
    }
    public void horn() {
        System.out.println("Tring Tring for AvonBicycle");
    }
    public void stand() {
        System.out.println("Stand for AvonBicycle");
    }
}
public class InterfaceInJavaDefaultMethod {
    public static void main(String [] args) {
        AvonBicycle ab=new AvonBicycle();
        ab.applyBrake();
        ab.speedUp();
        ab.horn();
        ab.stand();
        ab.carrier();

        HeroBicycle hb=new HeroBicycle();
        hb.applyBrake();
        hb.stand();
        hb.carrier();
    }
}
