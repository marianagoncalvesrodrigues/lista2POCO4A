import java.util.ArrayList;

class Main {


  public static void main(String[] args) {
    System.out.println("Hello world!");

    ArrayList <Animal> lista = new ArrayList<>();
    lista.add(new Sapo("sapo", "carnivoro"));
    lista.add(new Ra("ra", "onivoro"));
    lista.add(new Leao("leao", "carnivoro"));
    lista.add(new Macaco("macaco", "herbivoro"));

    for(Animal item: lista){
      System.out.println("\nO peso do(a) "+ item.getNome());
      item.peso();
      System.out.println("O tipo de alimentacao do(a) "+ item.getNome());
      item.getTipoAliment();
      
    }
     
  }
  
}
