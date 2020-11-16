public class Main {

  public static void main(String[] args) {

    Livro l1 = new Livro("Design Patterns");
    Livro l2 = new Livro("Java Programming Language");

    l1.solicitar(l1);    
    l1.solicitar(l1);    
    l1.devolver(l1);     

    l2.devolver(l2);     
  }

}

public class Livro {

  private EstadoLivro estado;   

  private String titulo;


  public Livro(String titulo) {
    this.titulo = titulo;
    this.estado = Disponivel.instancia();
  }

  public String toString() {
    return (this.titulo + " (" + this.estado + ")" );
  }

  void estabelecerEstado(EstadoLivro estado) {
    System.out.println("Transitando de " + this.estado + " a " + estado);
    this.estado = estado;
  }


  public void devolver() {
    this.estado.devolver(this);
  }

  public boolean solicitar() {
    return this.estado.solicitar(this);
  }
}

public abstract class EstadoLivro {



  public abstract void devolver(Livro livro);
  public abstract boolean solicitar(Livro livro);



  public String toString() {
    return "Desconhecido";
  }
}

public class Disponivel extends EstadoLivro {



  private static Disponivel instancia; // Instância do Singleton Disponivel

  protected Disponivel() {}

  public static Disponivel instancia() {
    if (this.instancia == null)
      this.instancia = new Disponivel();

    return this.instancia;
  }

 

  public boolean solicitar(Livro livro) {
    System.out.println("Atendendo pedido do livro " + livro);
    livro.estabelecerEstado(Emprestado.instancia());
    return true;
  }

  public void devolver(Livro livro) {
    System.out.println("Oba... já tenho o livro " + livro);
  }

  // Redefine o nome do estado...

  public String toString() {
    return "Disponivel";
  }
}


public class Emprestado extends EstadoLivro {


  private static Emprestado instancia;  // Instância do Singleton Emprestado

  protected Emprestado() {}

  public static Emprestado instancia() {
    if (this.instancia == null)
      this.instancia = new Emprestado();

    return this.instancia;
  }


  public boolean solicitar(Livro livro) {
    System.out.println("O livro " + livro + " não está disponível");
    return false;
  }

  public void devolver(Livro livro) {
    System.out.println("OK, o livro " + livro + " foi devolvido");
    livro.estabelecerEstado(Disponivel.instancia());
  }


  public String toString() {
    return "Emprestado";
  }
}
