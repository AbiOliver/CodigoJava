package lista3ex33;
import java.util.Scanner;

public class Lista3Ex33 {

    public static void main(String[] args) {
        int multiplos=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de n (inteiro e positivo): ");
        int n = scan.nextInt();
        while(n<=0){
            System.out.println("Os valor tem que maior que 0 e positivo. ");
            n = scan.nextInt();
        }
        System.out.print("Digite o valor de i (inteiro e positivo): ");
        int i = scan.nextInt();
        while(i<=0){
            System.out.println("Os valor tem que maior que 0 e positivo. ");
            i = scan.nextInt();
        }
        System.out.print("Digite o valor de j (inteiro e positivo): ");
        int j = scan.nextInt();
       while(j<=0){
            System.out.println("Os valor tem que maior que 0 e positivo. ");
            j = scan.nextInt();
        }
        while(multiplos<=n){
                    if (multiplos%i==0 || multiplos%j==0) {
                     System.out.println("Múltiplos: "+multiplos);
                    }
                    multiplos++;
                }
            }    
        }
    
