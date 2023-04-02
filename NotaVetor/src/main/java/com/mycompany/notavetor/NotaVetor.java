package com.mycompany.notavetor;
import java.util.Scanner;
public class NotaVetor {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
             double media=0, soma=0;
	         double nota []= new double[3];
             String nome;
             System.out.println("Nome: ");
             nome = scan.next();
            for(int i=0; i<nota.length; i++){
                
                System.out.println("digite a" +(i+1)+"º nota: ");
                nota[i]=scan.nextInt();
                soma+=nota[i];
            }
             media=soma/3;
             System.out.format("Nota final = %.2f\n",media);
	         if(media>5){
                 System.out.println("Aprovado!");
             }else{
                 System.out.println("Não foi aprovado!");
             }
        }
   }
