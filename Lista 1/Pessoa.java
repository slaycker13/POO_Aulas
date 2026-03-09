public class Pessoa{
    private final String nome;
    private final int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        if(idade <= 0){
            throw new IllegalArgumentException("Idade inválida!");
        } else {
            this.idade = idade;
        }
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String novoEndereco){
        endereco = novoEndereco;
        System.out.println("O endereço de " + nome + " foi atualizado para: " + endereco);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mariana", 20, "Rua dos Bobo, n°0");
        System.out.println("O nome da pessoa 1 é: " + p1.getNome());
        System.out.println("A idade da pessoa 1 é: " + p1.getIdade());
        System.out.println("O endereço da pessoa 1 é: " + p1.getEndereco());
        
        p1.setEndereco("Rua dos Bobões, n°20");
        
        System.out.println("O endereço da pessoa 1 é: " + p1.getEndereco());
        
        
        System.out.println("---");


        Pessoa p2 = new Pessoa("Robso", -3, "Rua dos Bobo, n°1");
    }
}