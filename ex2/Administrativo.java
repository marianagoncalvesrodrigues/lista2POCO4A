public class Administrativo extends MembroUniversidade {

    public Administrativo(int dias, int ausencias, boolean ru, boolean access){
    super(dias, ausencias, ru, access);
    }

    public int getDias(){
      return dias;
    }

    public int ausencias(){
      return ausencias;
    }

    public boolean freeRu(){
      return ru = false;
    }

    public boolean accessLab(){
      return access = false;
    }

    public float pagamento(){
      return 6789.0f;
    }
}
