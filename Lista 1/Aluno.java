import java.util.ArrayList;

public class Aluno{
    private final String nome;
    private final int matricula;
    private final ArrayList<ArrayList<Object>> disciplinasCursadas;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas = new ArrayList<>();
    }

    public void alunoInfo(){
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
        if(disciplinasCursadas.isEmpty()){
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        for(ArrayList<Object> disciplina : disciplinasCursadas){
            System.out.print(disciplina.get(0) + ": ");
            for (int i = 1; i < disciplina.size() ; i++) {
                System.out.print(disciplina.get(i) + " / ");
            }
            System.out.println();
        }
    }

    public void addDisciplina(String nomeDisciplina, double... notas){
        ArrayList<Object> disciplina = new ArrayList<>();
        disciplina.add(nomeDisciplina);
        for (double nota : notas) {
            disciplina.add(nota);
        }
        disciplinasCursadas.add(disciplina);
    }

    public double mediaNotas(String nomeDisciplina){
        for (ArrayList<Object> disciplina : disciplinasCursadas) {
            if (disciplina.get(0).equals(nomeDisciplina)) {
                double soma = 0;
                for (int i = 1; i < disciplina.size(); i++) {
                    soma += (Double) disciplina.get(i);
                }
                double media = soma / (disciplina.size() - 1);
                media = Math.round(media * 100.0) / 100.0;
                System.out.println("Sua média em " + nomeDisciplina + " é: " + media);
                return media;
            }
        }
        System.out.println("Nenhuma disciplina com o nome " + nomeDisciplina + " foi encontrada.");
        return 0;
    }

    public void aprovado(String nomeDisciplina){
        double media = mediaNotas(nomeDisciplina);
        if(media >= 7){
            System.out.println("Aprovado em " + nomeDisciplina + " com média: " + media);
        } else {
            System.out.println("Reprovado em " + nomeDisciplina + ". Média final: " + media);
        }
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pulga", 101);
        a1.alunoInfo();

        a1.addDisciplina("Cálculo A", 7, 6, 4);
        a1.addDisciplina("Algoritmos", 10, 9, 8, 10);
        a1.addDisciplina("Física I", 10, 8);

        a1.alunoInfo();

        a1.aprovado("Cálculo A");
        a1.aprovado("Algoritmos");
        a1.aprovado("Física I");
    }
}