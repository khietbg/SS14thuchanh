package thuchanh3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap size");
        int size = Integer.parseInt(scanner.nextLine());
        int arr[]= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Random().nextInt(20);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length -1; i++) {
            int min= arr[i];
          int  minIndex=i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
        System.out.println("\nsau khi sap xep");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
