public class Funcionario{
    private final String nome;
    private final String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        if(salario < 1621){
            System.out.println("Salário inválido! Salário mínimo inserido (1621).");
            this.salario = 1621;
        } else {
            this.salario = salario;
        }
    }

    public void funcInfo(){
        System.out.println("Nome: " + nome + " | Cargo: " + cargo + " | Salário: " + salario);
    }

    public void setAumento(int porcentagem){
        if(porcentagem < 0){
            System.out.println("Porcentagem Inválida! Operação não concluída.");
        } else {
            double salarioAntigo = salario;
            salario = salario * (1 + porcentagem / 100.0);
            System.out.println("O antigo salário era: " + salarioAntigo + " e com um aumento de " + porcentagem + "% resultou em: " + salario);
        }
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Roberto", "Gerente", 2000);
        f1.funcInfo();
        f1.setAumento(20);
        f1.funcInfo();

        System.out.println("---");

        Funcionario f2 = new Funcionario("Alberto", "Padeiro", 1000);
        f2.funcInfo();
        f2.setAumento(-20);
        f2.funcInfo();
    }
}