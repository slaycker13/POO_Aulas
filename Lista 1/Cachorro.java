public class Cachorro{
    private final String nome;
    private final String raca;
    private final int idade;
    private boolean fome;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        if(idade <= 0){
            System.err.println("Idade Inválida! Padrão inserido (1).");
            this.idade = 1;
        } else {
            this.idade = idade;
        }
        this.fome = true;
    }

    public void getInfo(){
        if(fome == true){
            System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " | Com fome!!");
        } else {
            System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " | De bucho cheio!");
        }
    }

    public void latir(){
        System.out.println("— " + nome + ": AUAUAUAUAUAU!");
    }

    public void comer(){
        if(fome == true){
            System.out.println(nome + " comeu!");
            fome = false;
        } else {
            System.out.println(nome + " não está com fome!");
        }
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Pulga","Golden", 8);
        c1.getInfo();
        c1.latir();
        c1.latir();
        c1.comer();
        c1.comer();

        System.out.println("---");

        Cachorro c2 = new Cachorro("Toby","Puddle", -10);
        c2.getInfo();
    }
}