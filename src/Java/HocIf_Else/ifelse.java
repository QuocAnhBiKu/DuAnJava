package Java.HocIf_Else;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so tien thue cua ban: ");
        long thue = scanner.nextLong();

        if (thue >= 10000 && thue < 15000){
            System.out.println("Thue 10% ");
        } else if (thue >= 15000 && thue <30000){
            System.out.println("Thue 20% ");
        } else if (thue >=30000) {
            System.out.println("Thue 50% ");
        } else {
            System.out.println("Khong dong thue ");
        }

    }
}
