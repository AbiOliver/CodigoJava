package com.mycompany.stringexer;
import java.util.Scanner;
public class StringExer {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String novo, novo2;
        //exercício para imprimir a letra com charAt();
        System.out.print("digite o primeiro nome: ");
        String nome1 = entrada.nextLine();
        System.out.print("digite o segundo nome: ");
        String nome2 = entrada.nextLine();
        
       
        
        System.out.println("Nome 1: "+nome1.toLowerCase());
        System.out.println("Nome 2: "+nome2.toLowerCase());
        System.out.println("Primeira letra do nome 1: "+nome1.charAt(0));
        System.out.println("Primeira letra do nome 2: "+nome2.charAt(0));
        
       
        
       novo = nome1.toLowerCase().replace("a","*");
       System.out.println(" "+novo);
       novo2 = nome2.toLowerCase().replace("o","#");
       System.out.println(" "+novo2);
       
       
        
    }
}
