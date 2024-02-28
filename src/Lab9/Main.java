package Lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Sinhvien sv1 = new Sinhvien();
        String mssv = scanner.nextLine();
        sv1.setMSSV(mssv);
        String hovaten = scanner.nextLine();
        sv1.setHoten(hovaten);
        try {
            double diem = scanner.nextDouble();
            if(0<diem && diem <10){
               sv1.setDiem(diem);
            }
        }catch (Exception e){
            System.out.println("Loi");
        }

        int age = scanner.nextInt();
        sv1.setAge(age);

        System.out.println(sv1.toString());

    }
}
