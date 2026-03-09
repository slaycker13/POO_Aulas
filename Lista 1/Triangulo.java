public class Triangulo{
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura){
        if(base <= 0){
            System.out.println("Valor de base inválido. Padrão inserido! (1)");
            this.base = 1;
        } else {
            this.base = base;
        }
        if(altura <= 0){
            System.out.println("Valor de altura inválido. Padrão inserido! (1)");
            this.altura = 1;
        } else {
            this.altura = altura;
        }
    }

    public void calcArea(){
        double area = (base*altura)/2;
        System.out.println("A área do triângulo (base = " + base + ", altura = " + altura + ") é: " + area);
    }

    public void calcPer(){
        double lado = Math.sqrt(((base/2)*(base/2) + altura*altura));
        double perimetro = 2*lado+base;
        System.out.println("O perimetro do triângulo (base = " + base + ", altura = " + altura + ") é: " + perimetro);
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(6, 4);
        t1.calcArea();
        t1.calcPer();

        System.out.println("---");

        Triangulo t2 = new Triangulo(-6, -4);
        t2.calcArea();
        t2.calcPer();
    }
}