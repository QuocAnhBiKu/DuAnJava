package Lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,cv,dt,min;
        System.out.printf("Nhap canh a: ");
        a = scanner.nextDouble();
        System.out.printf("Nhap canh b: ");
        b = scanner.nextDouble();

        cv = (a+b)*2;
        dt = a*b;
        min = Math.min(a,b);
        System.out.println("Chu vi HCM la: "+ cv);
        System.out.println("Dien tich HCM la: "+ dt);
        System.out.printf("Canh nho nhat cua HCM la: "+ min);


    }
}
