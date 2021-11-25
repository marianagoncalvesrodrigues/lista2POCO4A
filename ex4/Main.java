import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    float salarioBase = 2200;
    float salarioSemanal = 550;
    float bonificacao = 600;
    float taxaComissao = 250;
    int horas = 8;

    Bonificado b1 = new Bonificado("Joao", "Silva", salarioBase, salarioSemanal, bonificacao);
    Comissionado c1 = new Comissionado("Maria", "Soares", salarioBase, taxaComissao);
    Horista h1 = new Horista("Jomar", "Silva Soares", salarioBase, horas);

    ArrayList<Empregado> lista = new ArrayList<>();
    lista.add(c1);
    lista.add(h1);

    for(Empregado emp : lista){
      System.out.println(emp.imprimir());
      System.out.println(emp.ganhos());
    }
  }
}
