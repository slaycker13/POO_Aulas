import java.util.ArrayList;

public class Banco{
    private final String nome;
    private final ArrayList<ContaBancaria> contas;

    public Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void listarContas(){
        System.out.println("Banco: " + nome);
        int i = 0;
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        while(i < contas.size()){
            System.out.println(contas.get(i));
            i++;
        }
    }

    public void addConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria buscarConta(int numeroProcurado){
        int i = 0;
        while(i < contas.size()){
            ContaBancaria conta = contas.get(i);
            if(conta.getNumero() == numeroProcurado){
                return conta;
            }
            i++;
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void removeConta(int numeroProcurado){
        int i = 0;
        while(i < contas.size()){
            ContaBancaria conta = contas.get(i);
            if(conta.getNumero() == numeroProcurado){
                contas.remove(i);
                System.out.println("Conta removida com sucesso.");
                return;
            }
            i++;
        }
        System.out.println("Conta não encontrada.");
    }

    public static void main(String[] args) {
        Banco banco = new Banco("Santander");

        ContaBancaria c1 = new ContaBancaria(101, "João", 1000);
        ContaBancaria c2 = new ContaBancaria(102, "Maria", 500);
        ContaBancaria c3 = new ContaBancaria(103, "Ana", 200);

        banco.addConta(c1);
        banco.addConta(c2);
        banco.addConta(c3);

        System.out.println("Contas no banco:");
        banco.listarContas();

        System.out.println("\nBuscando conta 102:");
        ContaBancaria encontrada = banco.buscarConta(102);
        System.out.println(encontrada);

        System.out.println("\nRemovendo conta 101");
        banco.removeConta(101);

        System.out.println("\nContas após remoção:");
        banco.listarContas();
    }
}