public class Circulo{
    public double calcArea(double r){
        return Math.PI*r*r;
    }

    public double calcArea(double d, boolean isDiametro){
        return Math.PI*((d*2)*(d*2));
    }

    public double calcPer(double r){
        return 2*Math.PI*r;
    }

    public double calcPer(double d, boolean isDiametro){
        return 2*Math.PI*(d*2);
    }
}