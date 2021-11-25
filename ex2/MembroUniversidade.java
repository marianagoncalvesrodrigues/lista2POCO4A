public abstract class MembroUniversidade {
    public int dias, ausencias;
    protected boolean ru, access;
    
    public MembroUniversidade(int dias, int ausencias, boolean ru, boolean access){
      this.dias = dias;
      this.ausencias = ausencias;
      this.ru = ru;
      this.access = access;
    }

    public abstract float pagamento();
    
    public abstract int getDias();

    public abstract int ausencias();

    public abstract boolean freeRu();

    public abstract boolean accessLab();
    
    public String toString(){
      return this.getClass().getSimpleName();
    }
}
