package Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
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
}
