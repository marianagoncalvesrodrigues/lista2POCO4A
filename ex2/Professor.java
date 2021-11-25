public class Professor extends MembroUniversidade {

  public Professor(int dias, int ausencias, boolean ru, boolean access){
    super(dias, ausencias, ru, access);
  }

  public int getDias(){
    return dias;
  }

  public int ausencias(){
    return ausencias;
  }

  public float pagamento(){
    return 12345.0f;
  }

  public boolean freeRu(){
    return ru = false;
  }

  public boolean accessLab(){
    return access = true;
  }
}
