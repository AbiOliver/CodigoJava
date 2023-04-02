
package palavra;

public class Npalavra extends Exception {
private String minusculo;
    public Npalavra(String minusculo) {
        this.minusculo=minusculo;
    }

    @Override
    public String toString() {
        return "A palavra contem letras diferentes do que foi pedido";
    }
    
}
