public class Main {
  public static void main(String[] args) {
    try {
      Pilha pilha = new Pilha(3);

      pilha.insere(70);
      pilha.insere(35);
      pilha.insere(15);

      pilha.imprime();

      System.out.println("Cheia: " + pilha.cheia());

      pilha.remove();

      pilha.imprime();

      System.out.println("Cheia: " + pilha.cheia());
      System.out.println("Vazia: " + pilha.vazia());

      pilha.remove();
      pilha.remove();

      pilha.imprime();

      System.out.println("Vazia: " + pilha.vazia());

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}