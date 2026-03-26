public class Conversor{
    
    public int convertCF(int c){
        return (c * 9/5) + 32;
    }

    public double convertCF(double c){
        return (c * 9/5) + 32;
    }

    public int convertFC(int f){
        return (f - 32) * 5/9;
    }

    public double convertFC(double f){
        return (f - 32) * 5/9;
    }
    // --------------------------------------
    public int convertMP(int m){
        return (int)(m*3.281);
    }

    public double convertMP(double m){
        return m*3.281;
    }

    public int convertPM(int p){
        return (int)(p/3.281);
    }

    public double convertPM(double p){
        return p/3.281;
    }
    // --------------------------------------
    public int convertCM_P(int cm){
        return (int)(cm/2.54);
    }

    public double convertCM_P(double cm){
        return cm/2.54;
    }

    public int convertP_CM(int p){
        return (int)(p*2.54);
    }

    public double convertP_CM(double p){
        return p*2.54;
    }
}