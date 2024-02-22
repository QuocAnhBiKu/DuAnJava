package lab3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap 1 so trong bang cuu chuong(1 den 10) de in ra: ");
        int a = scanner.nextInt();
        for (int i = 1 ; i <=10;i++){
            System.out.printf("%d x %d = %d \n" ,a,i, a*i);

        }
    }
}
