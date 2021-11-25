public class Real implements IConversorMoeda{
  public float real;
  public Real(float real){
    this.real = real;
  }
@Override
  public double getConversaoDolar(){
    return this.real * 5.46;
  }
}
