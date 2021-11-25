import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 12;
    int z = 30;

    ArrayList<IConversorMoeda> lista = new ArrayList<>();
    lista.add(new BitCoin(x));
    lista.add(new Euro(y));
    lista.add(new Real(z));


    System.out.println("Hello world!");

    for(IConversorMoeda moeda : lista){
      System.out.println("\n\nmoeda: " + moeda +" em dolar: " + moeda.getConversaoDolar());
    }
  }
}
