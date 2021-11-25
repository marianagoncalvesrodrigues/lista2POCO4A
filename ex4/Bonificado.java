public class Bonificado extends Assalariado{
  public float bonificacao;
  public float salarioBase;
  public float salarioSemanal;
  public String nome;
  public String sobrenome;

  public Bonificado(String nome, String sobrenome, float salarioSemanal, float salarioBase, float bonificacao){
    setNome(nome, sobrenome);
    setSalario(salarioBase, salarioSemanal, bonificacao);
    ganhos();
    imprimir();
  }

  public void setNome(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public void setSalario(float salarioBase, float salarioSemanal, float bonificacao){
    this.salarioBase = salarioBase;
    this.salarioSemanal = salarioSemanal;
    this.bonificacao = bonificacao;
  }

  public double ganhos(){
    return this.salarioBase + this.bonificacao + this.salarioSemanal;
  }

  public String imprimir(){
    return "Nome: "+ this.nome + "\n Sobrenome: " + this.sobrenome +"\nSalario base: " + this.salarioBase + "\nBonificacao: "+this.bonificacao+"\nSalario semanal: "+this.salarioSemanal;
  }
}
