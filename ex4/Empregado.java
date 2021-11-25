public abstract class Empregado{
  public String nome;
  public String sobrenome;
  public float salarioBase;
  public int horas;
  public float taxaComissao;

  public abstract void setNome(String nome, String sobrenome);
  public abstract void setSalarioComissao(float salarioBase, float taxaComissao);
  public abstract void setSalarioHoras(float salarioBase, int horas);
  public abstract double ganhos();
  public abstract String imprimir();
}
