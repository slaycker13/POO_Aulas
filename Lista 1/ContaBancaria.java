public class ContaBancaria {
    private final int numero;
    private final String titular;
    private  double saldo;
    
    public ContaBancaria(int numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero;
    }

    public void depositar(double valor){
        if(valor>0){
            saldo += valor;
        } else {
            System.out.println("O valor de depósito deve ser positivo!");
        }
    }

    public void sacar(double valor){
        if(valor>0 && valor<=saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo inválido!");
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if(valor>0 && valor<=saldo){
            destino.saldo += valor;
            this.saldo -= valor;
        } else {
            System.out.println("Transferência inválido!");
        }
    }

    @Override
    public String toString(){
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: " + saldo;
    }


    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Pinga", 1000.00);
        ContaBancaria conta2 = new ContaBancaria(3, "Burguer", 0.00);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());

        conta1.depositar(400);
        conta1.sacar(175);
        conta1.transferir(conta2, 225);

        System.out.println("Saldo Final: " + conta1.getSaldo());

        System.out.println("---");

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: " + conta2.getSaldo());

        conta2.depositar(100);
        conta2.sacar(50);

        System.out.println("Saldo Final: " + conta2.getSaldo());
    }
}