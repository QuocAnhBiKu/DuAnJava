package Lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.printf("Số điện của bạn đang sử dụng là : ");
        int sodien = scanner.nextInt();
        long sotien;
        if(sodien > 0 && sodien <=100){
            sotien = sodien *1000;
            System.out.println("So tien dien cua ban la " + sotien);
        } else {
            sotien = 100*1000+ (sodien -100)*1500;
            System.out.println("So tien dien cua ban la " + sotien);
        }

    }
}
