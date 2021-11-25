public class Subtracao implements IOperacoes{
  public float operando1;
  public float operando2;
  public String nome;
  public int quantidade;
  public float resultado;

  public Subtracao(float operando1, float operando2){
    setOperando1(operando1);
    setOperando2(operando2);
    getResultado();
    getNome();
    getQuantidade();
  }

  public void setOperando1(float operando1){
    this.operando1 = operando1;
  }

  public void setOperando2(float operando2){
    this.operando2 = operando2;
  }

  public float getResultado(){
    this.resultado = this.operando1 - this.operando2;

    return this.resultado;
  }

  public String getNome(){
     this.nome = new String("Subtracao");
     return this.nome;
  }

  public int getQuantidade(){
    return this.quantidade++;
  }
}
