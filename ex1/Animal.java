import java.util.ArrayList;

public class Animal{

  private String nome;
  private String tipoAlimentacao;//setAlimentacao
  private ArrayList<String> alimentos_validos = new ArrayList<String>();

  public Animal(String nome, String alimento){
    setNome(nome);
    setTipoAliment(alimento);
  }

  public void setNome(String nome){//metodo1
    this.nome = nome;
  }
  
  public String getNome(){//metodo2
    return this.nome;
  }

  public void setTipoAliment(String alimento){//metodo3
    //tipos de aliementacao de uma animal
    alimentos_validos.add("onivoro");
    alimentos_validos.add("herbivoro");
    alimentos_validos.add("carnivoro");

    if(alimentos_validos.contains(alimento)){
      this.tipoAlimentacao = new String(alimento);
    }else{
      System.out.println("Invalido\n");
    }
  }

  public void getTipoAliment(){//metodo4
    System.out.println(tipoAlimentacao);
  }

  public void peso(){//metodo5
    System.out.println("00kg");
  }
}
