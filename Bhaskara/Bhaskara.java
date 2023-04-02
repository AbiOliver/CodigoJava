package bhaskara;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Bhaskara {
    public static void main(String[] args) throws EquacaoErrada{
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("A: ");
        try{
        a = scan.nextInt();
         if(a==0){
            throw new EquacaoErrada(a);
        }
        System.out.print("B: ");
        b = scan.nextInt();
        System.out.print("C: ");
        c = scan.nextInt();
        if(a!=0 && b==0 && c!=0){
           double recebeCondicao1 = condicao1(a,c);
            System.out.format("A raíz  é igual a +%.2f ou -%.2f",recebeCondicao1, recebeCondicao1);
        }else if(a!=0 && b!=0 && c==0){
            double recebeCondicao2 = condicao2(a,b);
            System.out.format("A raíz  é igual a +%.2f ou -%.2f",recebeCondicao2, recebeCondicao2);
        }else  if(a!=0 && b!=0 && c!=0){
           condicao3(a,b,c);
        }
    }catch(EquacaoErrada e){
            e.printStackTrace();
       }catch(InputMismatchException e){
            System.out.println("Entrada solicitada não atendida.");
       }catch(RuntimeException e){
            System.out.println("O parametro foi passado errado");
       }
    }
    public static double condicao1(int a, int c) {
        double raiz = Math.sqrt(c/a);
        return raiz;
    }
    public static double condicao2(int a, int b){
        double raiz = -b/a;
        return raiz;
    }
    public static void condicao3(int a, int b, int c){
       double delta = Math.pow(b, b)-4*a*c;
       if(delta>=0){
             double x1 = ( - b + Math.sqrt(delta))/(2*a);
             double x2 = ( - b - Math.sqrt(delta))/(2*a);
             System.out.format("A raíz  é igual a %.0f e %.0f",x1, x2);
        }else{
            System.out.println("D: "+delta);
            System.out.println("Delta não admite raízes reais");
      }
   }
}

   

        