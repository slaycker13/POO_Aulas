public class Endereco{
    private final String rua;
    private final int numero;
    private final String cidade;
    private final String estado;

    public Endereco(String rua, int numero, String cidade, String estado){
        this.rua = rua;
        this.cidade = cidade;
        this. estado = estado;
        if(numero > 0){
            this.numero = numero;
        } else {
            System.out.println("Número deve ser positivo!");
            this.numero = 1;
        }
    }
}