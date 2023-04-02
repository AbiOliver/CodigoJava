package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
         Scanner scan = new  Scanner(System.in);
      System.out.println("Digite um valor Inteiro e Positivo: ");
      int n = scan.nextInt();
      int fatorial = 1;
      int contador = 1;
      do{
         fatorial*= contador; 
         contador++;
      }while(contador<=n && contador>=0);
      if(n<0){
          System.out.println("Valor digitado está inválido.");
      }
        System.out.println(fatorial+"");
        scan.close();
    }
}
    

