package Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap 2 so nguyen a va b : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b==0 ){
            System.out.println("Phuong trinh vo so nghiem ");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem ");
        }else {
            float x =(float) (-b)/a;
            System.out.println("Nghiem cua phuong trinh la = %.3f " + x);
        }
    }
}
