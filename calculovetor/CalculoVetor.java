
package calculovetor;

import java.util.Scanner;
public class CalculoVetor {

  
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        
        int n = scan.nextInt();
        int vet[]=new int[n];
        
        leVetor(vet);
        somaVet(vet);
        mediaVet(vet, n);
        maiorValor(vet);
        posicaoMenorValor(vet);
        imprimeVetor(vet);
        
        scan.close();
    }
   
    static void leVetor(int [] vet){
         java.util.Scanner scan = new Scanner(System.in);
         for(int i=0; i<vet.length;i++){
            System.out.print("digite o valor do vet da posição "+(i+1)+" º :");
            vet[i] = scan.nextInt();
        }
    }
    static int somaVet(int[] vet){
       int soma = 0;
       for(int i=0; i<vet.length;i++){
             soma += vet[i];
        }
         return soma;
    }
    
    static int mediaVet(int vet [], int n){ 
        int media = 0, soma =0;
        for (int i = 0; i < vet.length; i++) {
                 soma = soma + vet[i];
                 media = soma/n;
        }
        acimaMedia( vet, media);
        return media;
    }
    static int maiorValor(int vet []){
        int maior = 0;
        for (int i = 0; i <vet.length; i++) {
                if (maior <= vet[i]) {
                maior = vet[i];
            }else if (maior>=vet[i]) {
                maior=maior;
            }
        }
        return maior;
    }
    
     static int posicaoMenorValor(int vet []){
        int menor = vet[0];
        int posi = 0;
        int i= 0;
        for(i=0;i<vet.length;i++){
          if(menor>vet[i] ){
          menor =vet[i];
          posi = i;
         }
         else{
         menor=menor;
         posi = posi;
      }
      
    }
    return posi;
   
    }
     
     static int acimaMedia(int vet[],  int media){
        int i =0;
        for ( i = 0; i < vet.length; i++) {
                if (vet[i]>media) {
                return vet[i];
               }
        }
        return 0;   
     }
       
}
