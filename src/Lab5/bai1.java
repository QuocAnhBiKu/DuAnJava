package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhap so ban muon: ");
            String x = scanner.nextLine();
            double a = Double.parseDouble(x);
            numbers.add(a);
            System.out.println("Ban nhap nua khong (Y/N)");
            if (scanner.nextLine().equals("N") ){
                break;
            }
        }
        double sum = 0;
        for (int i = 0 ; i< numbers.size() ; i++ ){
             sum += numbers.get(i);
        }

        System.out.println("Danh sach number: "+numbers.toString()+ " Va tong : " + sum);

    }
}
