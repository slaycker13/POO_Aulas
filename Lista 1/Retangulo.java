public class Retangulo{
    private final double largura;
    private final double altura;

    public Retangulo(double larg, double alt){
        if(larg <= 0){
            System.out.println("Largura inválida! Valor padrão inserido (1).");
            this.largura = 1;
        } else {
            this.largura = larg;
        }
        if(alt <= 0){
            System.out.println("Altura inválida! Valor padrão inserido (1).");
            this.altura = 1;
        } else {
            this.altura = alt;
        }
    }

    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

    public double calcArea(){
        return altura*largura;
    }
    
    public double calcPer(){
        return (2*altura)+(2*largura);
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,3);

        System.out.println("Largura do Retângulo 1: " + r1.getLargura());
        System.out.println("Altura do Retângulo 1: " + r1.getAltura());

        System.out.println("Área do Retângulo 1: " + r1.calcArea());
        System.out.println("Perímetro do Retângulo 1: " + r1.calcPer());

        System.out.println("---");

        Retangulo r2 = new Retangulo(-2,-3);

        System.out.println("Largura do Retângulo 2: " + r2.getLargura());
        System.out.println("Altura do Retângulo 2: " + r2.getAltura());

        System.out.println("Área do Retângulo 2: " + r2.calcArea());
        System.out.println("Perímetro do Retângulo 2: " + r2.calcPer());
    }
}