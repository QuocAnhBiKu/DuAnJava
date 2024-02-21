package Lab1;

import java.util.Scanner;

public class BaiTapLab1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.printf("Nhap diem trung binh: ");
        Double diem = scanner.nextDouble();

        System.out.printf(name+" co diem TB la " + diem);

    }
}
