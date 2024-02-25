package lab3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.printf("Nhap so phan tu mang ban mong muon: ");
        int a = scanner.nextInt();
        int[] array = new int[a] ;
        for (int i = 0 ;i < a ;i++ ){
            System.out.printf("Phan tu thu a[%d]: ",i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Phan tu trong mang la: " + Arrays.toString(array));

        levelUp(array);
        Max(array);
        Min(array);
    }
//    public static void showArr(int[] array){
//
//        for (int i = 0; i < array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//    }
    public static void levelUp(int[] array){
        System.out.print("\nMang theo thu tu tang dan la: ");
        Arrays.sort(array);
//        for (int i = 0 ; i< array.length;i++){
//             for (int j = i+1;j<array.length;j++){
//                 if (array[i]> array[j]){
//                     int temp = array [i];
//                     array[i]=array[j];
//                     array[j]=temp;
//                 }
//             }
//        }
        System.out.printf(Arrays.toString(array));

    }
    public  static void Max(int[] array){
        System.out.print("\nPhan tu mang lon nhat la: ");
        int soMax=array[0];
        for (int i = 0 ; i <array.length;i++){
                soMax = Math.max(soMax,array[i]);
        }
        System.out.print(soMax);
    }
    public  static void Min(int[] array){
        System.out.print("\nPhan tu mang nho nhat la: ");
        int soMin = array[0];
        for (int i = 0 ; i <array.length;i++){
                soMin = Math.min(soMin,array[i]);
        }
        System.out.print(soMin);
    }
}
