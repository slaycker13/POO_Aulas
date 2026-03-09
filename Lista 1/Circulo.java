public class Circulo{
    private final double raio;
    private final String cor;

    public Circulo(double raio, String cor){
        if(raio <= 0){
            System.err.println("Raio inválido! Valor padrão inserido (1).");
            this.raio = 1;
        } else {
            this.raio = raio;
        }
        this.cor = cor;
    }

    public double getRaio(){
        return raio;
    }

    public String getCor(){
        return cor;
    }

    public double calcArea(){
        return Math.PI*raio*raio;
    }
    
    public double calcPer(){
        return 2*Math.PI*raio;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2,"Vermelho");

        System.out.println("Raio do Círculo 1: " + c1.getRaio());
        System.out.println("Cor do Círculo 1: " + c1.getCor());

        System.out.println("Área do Círculo 1: " + c1.calcArea());
        System.out.println("Perímetro do Círculo 1: " + c1.calcPer());

        System.out.println("---");

        Circulo c2 = new Circulo(-2,"Rosa");

        System.out.println("Raio do Círculo 2: " + c2.getRaio());
        System.out.println("Cor do Círculo 2: " + c2.getCor());

        System.out.println("Área do Círculo 2: " + c2.calcArea());
        System.out.println("Perímetro do Círculo 2: " + c2.calcPer());
    }
}