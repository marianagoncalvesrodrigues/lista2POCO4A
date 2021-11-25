public abstract class Assalariado{
  public float salarioSemanal;
  public float salarioBase;
  public float bonificacao;
  public String nome;
  public String sobrenome;
  
  public abstract void setNome(String nome, String sobrenome);
  public abstract void setSalario(float salarioBase, float salarioSemanal, float bonificacao);
  public abstract double ganhos();
  public abstract String imprimir();
}
