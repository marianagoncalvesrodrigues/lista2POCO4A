public class BitCoin implements IConversorMoeda{
  public double dolar = 5.46;
  public double bitCoin;

  public BitCoin(float bitCoin){
    this.bitCoin = bitCoin;
  }

  public double custaEmReal(float bitCoin){
    return this.dolar * 349424.98 * bitCoin;
  }
@Override
  public double getConversaoDolar(){
    return this.bitCoin * 63844.30;
  }
}
