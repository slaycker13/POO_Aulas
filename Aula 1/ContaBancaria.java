public class ContaBancaria {
    // Atributos privados (encapsulados)
    private final String titular;
    private double saldo;
    
    // Construtor da classe
    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método público para acessar o titular
    public String getTitular(){
        return titular;
    }
    
    // Método público para acessar o saldo
    public double getSaldo(){
        return saldo;
    }

    // Método público para depositar um valor no saldo
    public void depositar(double valor){
        if(valor>0){
            saldo += valor;
        } else {
            System.out.println("O valor de depósito deve ser positivo!");
        }
    }

    // Método público para sacar um valor do saldo
    public void sacar(double valor){
        if(valor>0 && valor<=saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo inválido!");
        }
    }
    public static void main(String[] args) {
        // Criação de uma nova conta (Objeto)
        ContaBancaria conta = new ContaBancaria("Pinga", 1000.00);

        // Exibindo o saldo e realizando operações
        System.out.println("Titular: " + conta.getTitular()); // Acesso ao titular
        System.out.println("Saldo: " + conta.getSaldo()); // Acesso ao saldo

        conta.depositar(400);
        conta.sacar(175);

        System.out.println("Saldo Final: " + conta.getSaldo());
    }
}