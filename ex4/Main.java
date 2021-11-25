import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    ArrayList<IOperacoes>lista = new ArrayList<>();
    lista.add(new Soma(2.0f,3.0f));
    lista.add(new Subtracao(5.0f,3.0f));
    lista.add(new Divisao(6.0f,3.0f));
    lista.add(new Multiplicacao(2.0f,3.0f));

    for(IOperacoes op : lista){
      System.out.println("Operacao: "+ op.getNome());
      System.out.println("\nResultado: "+ op.getResultado());
      System.out.println("\nQuantidade que a operacao foi realizada: "+ op.getQuantidade());
      System.out.printf("\n///////////////////////////////////////////////////\n");
    }
  }
}
