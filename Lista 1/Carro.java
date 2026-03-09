public class Carro{
    private final String marca;
    private final String modelo;
    private final int ano;
    private double velocidade;
    private boolean status;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        if(ano < 1886){
            throw new IllegalArgumentException("Ano inválido, o primeiro carro surgiu em 1886!");
        } else {
            this.ano = ano;
        }
        this.velocidade = 0;
        this.status = false;
    }

    public void ligar(){
        if(status == true){
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " já está ligado!");
        } else {
            status = true;
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " ligou!");
        }
    }

    public void desligar(){
        if(status == false){
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " já está desligado!");
        } else {
            status = false;
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " desligou!");
        }
    }

    public void acelerar(){
        velocidade += 10;
        System.out.println("O carro " + marca +" "+ modelo +" "+ ano + " acelerou. Velocidade atual: " + velocidade);
    }

    public void frear(){
        if(velocidade > 0){
            velocidade -= 10;
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " freou. Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro " + marca +" "+  modelo +" "+ ano + " já está parado!");
        }
    }



    public static void main(String[] args) {
        Carro c1 = new Carro("Ford","Mustang", 2014);
        c1.ligar();
        c1.ligar();
        c1.acelerar();
        c1.frear();
        c1.desligar();

        System.out.println("---");

        Carro c2 = new Carro("Toyota","Trueno",1700);
    }
}