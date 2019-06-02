package com.company;
import java.util.Random;

//улучшенная рулетка
// не работает
// при запуске не одно число не работате 
public class Main {

    public static void main(String[] args) {
        Random rulet = new Random();


        int num[] = new int[33];

        for (int i = 0; i > 1000; i++){
            ++num[rulet.nextInt(33)];
        }
        System.out.println("Номер\tЧисло");

        for ( int i = 0; i<num.length; i++){
            System.out.println(i +"\t" + num[i]);
        }
    }
}
