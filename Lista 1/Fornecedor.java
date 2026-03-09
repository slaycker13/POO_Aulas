import java.util.ArrayList;

public class Fornecedor{
    private final String nome;
    private final String endereco;
    private ArrayList<Produto> listaProdutos;

    public Fornecedor(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        listaProdutos = new ArrayList<>();
        System.out.println("Fornecedor criado: " + nome + " | Endereço: " + endereco);
    }

    public void adicionarProduto(Produto p){
        if(listaProdutos.contains(p)){
            System.out.println("Produto já existe na lista: " + p.getNome());
        } else {
            listaProdutos.add(p);
            System.out.println("Produto adicionado: " + p.getNome());
        }
    }

    public void removerProduto(Produto p){
        if(!listaProdutos.contains(p)){
            System.out.println("Produto não existe na lista: " + p.getNome());
        } else {
            listaProdutos.remove(p);
            System.out.println("Produto removido: " + p.getNome());
        }
    }

    public double calcularTotal(){
        double total = 0;

        System.out.println("\nCalculando valor total...");

        for(Produto p : listaProdutos){
            double valor = p.getPreco() * p.getEstoque();
            System.out.println(p.getNome() + " -> " + p.getPreco() + " x " + p.getEstoque() + " = " + valor);
            total += valor;
        }

        return total;
    }

    public static void main(String[] args) {

        Produto p1 = new Produto("Pão", 5.0, 10);
        Produto p2 = new Produto("Leite", 4.0, 5);
        Produto p3 = new Produto("Arroz", 20.0, 2);

        Fornecedor f1 = new Fornecedor("Mercado Central", "Rua A");

        System.out.println("\nAdicionando produtos...");
        f1.adicionarProduto(p1);
        f1.adicionarProduto(p2);
        f1.adicionarProduto(p3);

        System.out.println("\nProdutos adicionados. Calculando total...");

        double total = f1.calcularTotal();

        System.out.println("\nValor total fornecido: " + total);
    }
}