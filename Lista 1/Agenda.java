
import java.util.ArrayList;

public class Agenda{
    private final ArrayList<Contato> listaContatos;
    private final int maxContatos;

    public Agenda(int max){
        this.maxContatos = max;
        this.listaContatos = new ArrayList<>();
    }

    public void addContato(String nome, String numero){
        Contato c = new Contato(nome, numero);
        if(listaContatos.size() >= maxContatos){
            System.out.println("Número máximo de contatos atingidos!");
        } else {
            System.out.println("O contato: " + nome + ", de número: " + numero + " foi adicionado.");
            listaContatos.add(c);
        }
    }

    public void removeContato(String nome){
        for(Contato c : listaContatos){
            if(c.getNome().equals(nome)){
                listaContatos.remove(c);
                System.out.println("O contato de " + nome + " foi removido.");
                return;
            }
        }
        System.out.println("O contato " + nome + " não existe em sua lista.");
    }

    public void buscarContato(String nome){
        for(Contato c : listaContatos){
            if(c.getNome().equals(nome)){
                System.out.println("Contato: " + nome + " | Número: " + c.getNumero());
                return;
            }
        }
        System.out.println("O contato " + nome + " não existe em sua lista.");
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda(2);

        System.out.println("Adicionando contatos...");
        agenda.addContato("João", "9999-1111");
        agenda.addContato("Maria", "9888-2222");
        agenda.addContato("Pedro", "9777-3333");

        System.out.println("\nBuscando contatos...");
        agenda.buscarContato("Maria");
        agenda.buscarContato("Carlos");

        System.out.println("\nRemovendo contato...");
        agenda.removeContato("João");

        System.out.println("\nBuscando novamente...");
        agenda.buscarContato("João");
    }
}