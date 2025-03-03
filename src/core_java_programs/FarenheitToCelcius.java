package core_java_programs;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperarture in faranheit-");
        double faranheit = sc.nextDouble();
        double celcius = (faranheit - 32d) * (5d / 9d);
        System.out.println("tuza temperature ahe- " + celcius);

    }
}
