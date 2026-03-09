
import java.util.ArrayList;

public class CarrinhoDeCompras{
    private final ArrayList<Produto> produtos;
    private double valorFinal;

    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
        valorFinal = 0;
    }

    public void adicionarProduto(String nome, double preco, int quantidade){
        Produto p = new Produto(nome, preco, quantidade);
        if(produtos.contains(p)){
            System.out.println("Produto já existe na lista: " + nome);
        } else {
            produtos.add(p);
            System.out.println("Produto adicionado: " + nome);
        }
    }

    public void removerProduto(String nome){
        for(Produto p : produtos){
            if(p.getNome().equals(nome)){
                produtos.remove(p);
                System.out.println("Produto removido: " + nome);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
    }

    public double calcularTotal(){
        System.out.println("\nCalculando valor total...");
        for(Produto p : produtos){
            double valor = p.getPreco() * p.getEstoque();
            System.out.println(p.getNome() + " -> " + p.getPreco() + " x " + p.getEstoque() + " = " + valor);
            valorFinal += valor;
        }
        return valorFinal;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Adicionando produtos...");
        carrinho.adicionarProduto("Arroz", 20.0, 2);
        carrinho.adicionarProduto("Leite", 5.0, 4);
        carrinho.adicionarProduto("Pão", 2.0, 10);

        System.out.println("\nCalculando total:");
        double total = carrinho.calcularTotal();
        System.out.println("Total do carrinho: " + total);

        System.out.println("\nRemovendo produto...");
        carrinho.removerProduto("Leite");

        System.out.println("\nRecalculando total:");
        total = carrinho.calcularTotal();
        System.out.println("Total do carrinho: " + total);
    }
}