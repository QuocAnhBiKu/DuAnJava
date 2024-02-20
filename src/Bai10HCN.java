import java.util.Scanner;

public class Bai10HCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y;
        while (true){
            System.out.printf("Moi ban nhap chieu dai va chieu rong hinh chu nhat(Nhap 0 de thoat): ");
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            try {
                x = Double.parseDouble(a);
                y = Double.parseDouble(b);

                if (x == 0 || y == 0){
                    break;
                }
                double cv = (x+y)*2;
                double dt = x * y;

                System.out.println("Chu vi hinh chu nhat la: "+ cv);
                System.out.println("Dien tich hinh chu nhat la: "+dt);
            } catch (Exception e){
                System.out.println("Vui long nhap so");
            }
        }
        System.out.printf("Ket thuc chuong trinh");
    }
}
