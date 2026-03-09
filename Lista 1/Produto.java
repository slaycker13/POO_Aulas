public class Produto{
    private final String nome;
    private final double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! Padrão inserido (10)");
            this.preco = 10;
        }
        if(estoque > 0){
            this.estoque = estoque;
        } else {
            System.out.println("Estoque inválido! Padrão inserido (10)");
            this.estoque = 10;
        }
    }

    public void prodInfo(){
        System.out.println("Produto: " + nome + " | Preço: R$" + preco +  " | Quantidade no estoque: " + estoque);
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    public void adicionarEstoque(int valor){
        if(valor >= 0){
            estoque += valor;
            System.out.println("Foi adicionado " + valor + " produtos ao estoque.");
        } else {
            System.out.println("Valor inválido. Operação não concluída.");
        }
    }

    public void removerEstoque(int valor){
        if(valor >= 0){
            estoque -= valor;
            System.out.println("Foi removido " + valor + " produtos do estoque.");
        } else {
            System.out.println("Valor inválido. Operação não concluída.");
        }
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Pinga", 20, 30);
        p1.prodInfo();
        p1.adicionarEstoque(-10);
        p1.adicionarEstoque(10);
        p1.removerEstoque(5);
        p1.removerEstoque(-5);
        p1.prodInfo();

        System.out.println("---");

        Produto p2 = new Produto("Ovo", -5, -10);
        p2.prodInfo();
        p2.adicionarEstoque(10);
        p2.removerEstoque(5);
        p2.prodInfo();
    }
}