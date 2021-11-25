public class Euro implements IConversorMoeda{
  public double inflacao = 0.03;
  public float euro;
  public Euro(float euro){
    this.euro = euro;
  }

  public double inflacao(float qdtEuro){
    return this.inflacao * qdtEuro;
  }
@Override
  public double getConversaoDolar(){
    return this.euro*1.14;
  }
}
