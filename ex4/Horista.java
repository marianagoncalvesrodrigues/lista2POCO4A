public class Horista extends Empregado{
  public int horas;
  public float salarioBase;
  public String nome;
  public String sobrenome;

  public Horista(String nome, String sobrenome, float salarioBase, int horas){
    setNome(nome, sobrenome);
    setSalarioHoras(salarioBase, horas);
    setSalarioComissao(0,0);
    ganhos();
    imprimir();
  }

  public void setNome(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public void setSalarioHoras(float salarioBase,  int horas){
    this.salarioBase = salarioBase;
    this.horas = horas;
  }

  public void setSalarioComissao(float salarioBase, float  zero){
  
  }

  public double ganhos(){
    return this.salarioBase + (this.horas*0.10*this.salarioBase);
  }

  public String imprimir(){
    return "Nome: "+ this.nome + "\n Sobrenome: " + this.sobrenome +"\nSalario base: " + this.salarioBase + "\nHoras: "+this.horas;
  }

}
