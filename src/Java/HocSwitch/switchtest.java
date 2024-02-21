package Java.HocSwitch;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Moi lua chon cua ban: ");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.printf("Ban da lua chon phep cong");
                break;
            case 2:
                System.out.printf("Ban da lua chon phep tru");
                break;
            default:
                System.out.printf("Ban da lua chon ket thuc chuong trinh");
                System.exit(0);

        }

    }
}
