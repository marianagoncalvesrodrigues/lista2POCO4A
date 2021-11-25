



public class Comissionado extends Empregado{
  public float taxaComissao;
  public float salarioBase;
  public String nome;
  public String sobrenome;

  public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao){
    setNome(nome, sobrenome);
    setSalarioComissao(salarioBase, taxaComissao);
    setSalarioHoras(0,0);
    ganhos();
    imprimir();
  }

  public void setNome(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public void setSalarioHoras(float salarioBase, int zero){

  }

  public void setSalarioComissao(float salarioBase, float taxaComissao){
    this.salarioBase = salarioBase;
    this.taxaComissao = taxaComissao;
  }

  public double ganhos(){
    return this.salarioBase + this.taxaComissao;
  }

  public String imprimir(){
     return "Nome: "+ this.nome + "\n Sobrenome: " + this.sobrenome +"\nSalario base: " + this.salarioBase + "\nTaxa de comissao: "+this.taxaComissao;
  }
}
