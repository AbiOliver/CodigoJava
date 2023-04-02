
package com.mycompany.lista2ex21;

import java.util.Scanner;
public class Lista2Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Entrada*/ 
        int cont = 0;
        do{
            
        
        System.out.println("----------------------------");
        System.out.println("Escolha uma das opçoes: ");//Menu de operações básicas.
        System.out.println("1- Soma de 2 números");
        System.out.println("2- Diferenca entre 2 números");
        System.out.println("3- Produto entre 2 números.");
        System.out.println("4- Divisão entre 2 números");
        System.out.println("----------------------------");
        int opcao = scan.nextInt();
        
        /*Processamento*/
        if(opcao ==1 ){//Condição 1, caso a opção seja soma
            System.out.print("Digite o primeiro valor: ");
            int n1 = scan.nextInt();
            System.out.print("Digite o segundo valor: ");
            int n2 = scan.nextInt();
            int soma = n1+n2;
            System.out.println("A soma de "+n1+" + "+n2+" = "+soma);////exibição do resultado da soma.
        }else if(opcao == 2){//Condição 2, caso a opção seja a diferença.
            System.out.print("Digite o primeiro valor: ");
            int n1 = scan.nextInt();
            System.out.print("Digite o segundo valor: ");
            int n2 = scan.nextInt();
            if(n1>n2){//Se o primeiro valor seja maior que o segundo, o primeiro subtrai sobre  segundo.
                int diferenca = n1-n2;
                System.out.println("A subtração de "+n1+" - "+n2+" = "+diferenca);//exibição do resultado da subtração, sendo o n1 maior que n2.
            }else{//Caso o segundo número seja maior que o primeiro, o segundo subtrai sobre o primeiro.
                int diferenca = n2-n1;
                /*Saída*/
                System.out.println("A subtração de "+n2+" - "+n1+" = "+diferenca);//exibição do resultado da subtração, sendo o n2 maior que n1.
            }
        }else if(opcao == 3){//condição, caso a opção seja produto.
            System.out.print("Digite o primeiro valor: ");
            int n1 = scan.nextInt();
            System.out.print("Digite o segundo valor: ");
            int n2 = scan.nextInt();
            int produto = n1*n2;
            System.out.println("A multiplicação de "+n1+" * "+n2+" = "+produto);//exibição do resultado do produto.
        }else if(opcao == 4){//condição, caso a opção seja divisão.
            System.out.print("Digite o divisor: ");
            double divisor = scan.nextInt();
                 System.out.print("Digite o denominador: ");
            int denominador = scan.nextInt();
               double quociente = divisor/denominador;
               /*Saída*/
               System.out.printf("A divisão de "+divisor+" / "+denominador+" = %.2f",quociente);//exibição do resultado da divisão.
        }else{ //Condição, caso o usuário escolha uma opção inexistente no menu.
            System.out.println("Opção inválida!");
        }
         cont++;
        }while(cont<2);
    }
}
