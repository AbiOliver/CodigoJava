package com.mycompany.vetmaior;

import java.util.Scanner;
public class VetMaior {
    
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
        int num[]= new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Valor: ");
            num [i]=scan.nextInt();
        }
        int maior=0;
        for (int i = 0; i < 3; i++) {
            if(maior <= num[i]){
                maior = num[i];
            }if(maior>num[i]){
                maior = maior;
            }
        }
        System.out.println("Maior: "+maior);
       
       
      
    }
}
