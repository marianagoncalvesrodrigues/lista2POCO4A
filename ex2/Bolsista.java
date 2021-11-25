public class Bolsista extends MembroUniversidade {
  
  public Bolsista(int dias, int ausencias, boolean ru, boolean access){
    super(dias, ausencias, ru, access);
  }
   
  public int getDias(){
    return dias;
  }

  public int ausencias(){
    return ausencias;
  }

    public float pagamento(){
      return 6789.0f;
    }

  public boolean freeRu(){
    return ru = true;
  }

   public boolean accessLab(){
    return access = false;
  }
}
