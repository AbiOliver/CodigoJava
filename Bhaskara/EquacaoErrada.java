package bhaskara;
public class EquacaoErrada extends Exception {
     private int a;
        
    public EquacaoErrada(int a) {
       this.a = a;
    }
    @Override
    public String toString() {
        return "O valor de 'A' tem que ser diferente  de 0, senão não é uma equação 2º grau.";
    }
}
