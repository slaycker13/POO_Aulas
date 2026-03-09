public class Contato{
    private final String nome;
    private final String numero;

    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }
}