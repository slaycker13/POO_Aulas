public class ContaBancaria{
    private final String titular;
    private final int numero;
    private final double saldo;

    public ContaBancaria(String titular, int numero, double saldo){
        this.titular = titular;
        if(numero > 0){
            this.numero = numero;
        } else {
            System.out.println("Número inválido!");
            this.numero = 1;
        }
        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!");
            this.saldo = 0;
        }
    }
}