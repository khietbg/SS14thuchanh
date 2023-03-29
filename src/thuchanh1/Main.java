package thuchanh1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int list[]= {7,5,3,1,22,8,6,4,14,9};
        Boolean nextPass = true;
        for (int k = 0; k < list.length&&nextPass; k++) {
            nextPass=false;
            for (int i = 0; i < list.length-k; i++) {
                if (list[i]>list[i+1]){
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
            }
                    nextPass = true;
                }
            }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
        }
//        System.out.println("mang sau khi sap xep"+ list);
    }
