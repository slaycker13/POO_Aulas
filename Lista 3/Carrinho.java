public class Carrinho{

    public void addProduto(String nome, double peso){
        System.out.println("O produto: " + nome + " com peso: " + peso + "g foi adicionado!");
    }

    public void addProduto(String nome, int pot){
        System.out.println("O produto: " + nome + " com potencia: " + pot + "W foi adicionado!");
    }

    public void addProduto(String nome, String tamanho){
        System.out.println("O produto: " + nome + " com tamanho: " + tamanho + " foi adicionado!");
    }
}