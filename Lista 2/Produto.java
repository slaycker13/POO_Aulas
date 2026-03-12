public class Produto{
    private final String nome;
    private final double preco;
    private final int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
            this.preco = 10;
        }
        if(estoque >= 0){
            this.estoque = estoque;
        } else {
            System.out.println("Estoque inválido!");
            this.estoque = 0;
        }
    }
}