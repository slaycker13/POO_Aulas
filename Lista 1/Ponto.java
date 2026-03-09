public class Ponto{
    private final double x;
    private final double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distancia(Ponto outro){
        double dx = outro.getX()-x;
        double dy = outro.getY()-y;
        double dist = Math.sqrt(dx*dx+dy*dy);
        return dist;
    }

    public void checkPontos(Ponto outro){
        if(outro.getX() == x && outro.getY() == y){
            System.out.println("Os pontos A e B, são iguais!");
        } else {
            System.out.println("Os pontos A e B, são diferentes!");
        }
    }


    public static void main(String[] args) {
        Ponto p1 = new Ponto(2,3);
        System.out.println("O ponto A é: ("+p1.getX()+","+p1.getY()+").");

        System.out.println("---");

        Ponto p2 = new Ponto(2,3);
        System.out.println("O ponto A é: ("+p2.getX()+","+p2.getY()+").");

        System.out.println("---");
        System.out.println("A distância entre A e B é: " + p1.distancia(p2));
        p1.checkPontos(p2);
    }
}