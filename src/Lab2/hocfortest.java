package Lab2;

import java.util.Scanner;

public class hocfortest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0 ;
        System.out.printf("Nhap so vao de tim tam giac");
        int n = scanner.nextInt();
        for (int i = 1 ; i <= n; i++,k=0 ){
            for (int j = 1 ; j <= n-i;j++){
                System.out.print(" ");
            }

            while (k != 2*i - 1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
