public class Pessoa{
    private final String nome;
    private final int idade;
    private final String profissao;

    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.profissao = profissao;
        if(idade <= 0){
            System.out.println("Idade inválida! Mínimo inserido (1)");
            this.idade = 1;
        } else {
            this.idade = idade;
        }
    }
}