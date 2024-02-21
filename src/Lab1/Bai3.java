package Lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap canh lap phuong: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh,3);

        System.out.printf("The tich cua lap phuong la: " + theTich);
    }
}
