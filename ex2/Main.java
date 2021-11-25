import java.util.ArrayList; 

class Main {

  public static void main(String[] args) {

    ArrayList <MembroUniversidade> lista = new ArrayList<>();
    lista.add(new Administrativo(90, 3, true, true));
    lista.add(new Bolsista(60, 0, true, true));
    lista.add(new Professor(90, 0, true, true));
    lista.add(new Tecnico(90, 3, true, true));
    
    for(MembroUniversidade membro : lista){
      System.out.println(
        "\n\nMembro: "+ membro 
        +"\nDias trabalhados: "+ membro.getDias()
        +"\nAusencias: "+ membro.ausencias()
        +"\nPossui ticket do ru?: "+ membro.freeRu()
        +"\nPossui acesso ao laboratorio?: "+ membro.accessLab()
        +"\nPagamento: "+ membro.pagamento());
    }


  }
}
