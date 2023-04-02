import java.util.Scanner;
public class Distancia {
    public static void main (String[] args) {
        //declarações, instanciação e entradas
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as coordenadas de P1:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.println("digite as coordenadas de P2:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        // processamento
        double d1 = (x1-x2) * (x1-x2);
        double d2 = Math.pow(y1-y2, 2);
        double d = Math.sqrt(d1 + d2);
        
        //double d = Math.sqrt ((x1-x2)*(x1-x2) + Math.pow(y1-y2, 2));
        //saída
        System.out.println("distancia entre P1 e P2 = " + d);
        sc.close();
    }
}
