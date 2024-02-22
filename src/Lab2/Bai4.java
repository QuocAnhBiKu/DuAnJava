package Lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");

        System.out.printf("Nhap tinh nang ban muon chon: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            default:
                System.out.printf("Ban da lua chon ket thuc chuong trinh");
                System.exit(0);
        }
    }
    public static void bai1(){
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
    public static void bai2(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Moi ban nhap 3 so nguyen a, b, c : ");
        int a,b,c;
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();

        if (a==0){
            if (b == 0 && c==0 ){
                System.out.println("Phuong trinh vo so nghiem ");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem ");
            }else {
                int x = (-c)/b;
                System.out.println("Nghiem cua phuong trinh la : " + x);
            }
        }
        else if (a != 0){
            double detal = Math.pow(b,2) - (4*a*c) ;

            if (detal > 0){
                double x1 = (-b + Math.sqrt(detal)/(2*a));
                double x2 = (-b - Math.sqrt(detal)/(2*a));
                System.out.println("Phuong trinh nay co 2 nghiem x1 = " + x1 + " x2 = "+ x2);
            } else if (detal == 0) {
                double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep la x = " + x);
            }else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
    }
    public static void bai3(){
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
