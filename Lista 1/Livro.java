public class Livro{
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    private boolean status;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao; // Tecnicamente, -ano poderia representar anos AC
        this.status = false;
    }

    public void getInfo(){
        if(status == true) {
            System.out.println("Nome: " + titulo + " | Autor: " + autor + " | Ano de Publicação: " + anoPublicacao + " | Status: Emprestado");
        } else {
            System.out.println("Nome: " + titulo + " | Autor: " + autor + " | Ano de Publicação: " + anoPublicacao + " | Status: Disponível");
        }
    }

    public void emprestar(){
        if(status == true){
            System.out.println("O livro já foi emprestado!");
        } else {
            status = true;
            System.out.println("O livro " + titulo + " de " + autor + " foi emprestado.");
        }
    }

    public void devolver(){
        if(status == false){
            System.out.println("O livro já foi devolvido!");
        } else {
            status = false;
            System.out.println("O livro " + titulo + " de " + autor + " foi devolvido.");
        }
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("A Ilha Misteriorsa","Julio Verne", 1874);
        l1.getInfo();
        l1.emprestar();
        l1.getInfo();
        l1.emprestar();
        l1.devolver();
        l1.getInfo();
    }
}