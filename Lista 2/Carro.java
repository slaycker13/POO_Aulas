public class Carro{
    private final String modelo;
    private final String marca;
    private final int ano;

    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        if(ano < 1886){
            System.out.println("Carros ainda não existiam nesse ano!");
            this.ano = 1886;
        } else {
            this.ano = ano;
        }
    }
}