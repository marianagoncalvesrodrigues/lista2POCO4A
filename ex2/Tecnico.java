public class Tecnico extends MembroUniversidade {

    public Tecnico(int dias, int ausencias, boolean ru, boolean access){
      super(dias, ausencias, ru, access);
    }

    public int getDias(){
      return dias;
    }

    public int ausencias(){
     return ausencias;
    }

    public boolean freeRu(){
      return ru = true;
    }

    public float pagamento(){
      return 6789.0f;
    }

    public boolean accessLab(){
      return access = true;
    }

}
