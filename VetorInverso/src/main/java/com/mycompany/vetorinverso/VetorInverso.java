package com.mycompany.vetorinverso;

import java.util.Scanner;


public class VetorInverso {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int i=0;
         int total=5;
         int numeros[]= new int [total];
         for (i=0;i<total; i++) {
             System.out.print("Digite o "+(i+1)+"º numero do vetor: ");
             numeros[i]=scan.nextInt();
        }
         for(i=total-1;i>=0;i--){//invertindo
         System.out.print(numeros[i]+"|");
              }

        }
   }
