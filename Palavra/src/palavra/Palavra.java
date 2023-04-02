package palavra;
import java.util.Scanner;


public class Palavra {
    public static void main(String[] args) throws Npalavra {
             
   Scanner scan = new Scanner(System.in);
     int i =0;
   try{
            System.out.print("\nEscreva uma palavra contendo as mesmas letras da palavra 'thalita' ".toLowerCase());
            String minusculo = scan.nextLine();
        for ( i = 0; i <minusculo.length(); i++) {
            if(minusculo.charAt(i)!='t'&& minusculo.charAt(i)!='h'&& minusculo.charAt(i)!='a' && minusculo.charAt(i)!='l'&& minusculo.charAt(i)!='i'&& minusculo.charAt(i)!='t' && minusculo.charAt(i)!='a'){
                   throw new Npalavra(minusculo);
            }
        }
        System.out.println("mostra: "+minusculo);
   }catch(Npalavra e){
       e.printStackTrace();
   }
 }
}
    

