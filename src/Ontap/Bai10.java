package Ontap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        while (true) {
            System.out.printf(" Moi ban nhap ban kinh hinh chon (Nhap 0 de thoat): ");
            String r = scanner.nextLine();
            try {
                number = Double.parseDouble(r);
                if (number == 0) {
                    break;
                }
                double cv = number * Math.PI * 2;
                double dt = Math.PI * Math.pow(number, 2);


                System.out.println("Chu vi hinh tron = " + cv);
                System.out.println("Dien tich hinh tron = " + dt);
            } catch (Exception e){
                System.out.println("Vui lap nhap so ");
            }
        }
        System.out.printf("Chuong trinh ket thuc");


    }
}
