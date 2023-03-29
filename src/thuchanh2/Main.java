package thuchanh2;

import java.sql.BatchUpdateException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size");
        int size= Integer.parseInt(scanner.nextLine());
        int arr[]= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu vao mang");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+" ");
        }
        Boolean needNextPass = true;
        for (int k = 0; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    needNextPass = true;
                }
            if (needNextPass==false){
                System.out.println("Array may be sorted and next pass not needed");
            }
            System.out.println("\"List after the  \" + k + \"' sort: \"");
            for (int i = 0; i < args.length; i++) {
                System.out.println(arr[i]+"\t");
            }
        }
    }



}
