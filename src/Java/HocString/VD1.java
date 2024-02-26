package Java.HocString;

import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap username: ");
        String a = scanner.nextLine();
        System.out.println("Moi ban nhap passwork");
        String b = scanner.nextLine();

        if (a.equals("hoidanit") && b.length() > 6){
            System.out.println("Hop le");
        }else {
            System.out.println("ko Hop le");
        }
    }
}
