package Lab1;

import java.util.Scanner;

public class BaiTapLab1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten cua ban: ");
        String a = scanner.nextLine();
        System.out.printf("Nhap diem trung binh: ");
        Double b = scanner.nextDouble();

        System.out.printf(a+" co diem TB la " + b);

    }
}
