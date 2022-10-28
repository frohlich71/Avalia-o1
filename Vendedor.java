
public class Vendedor extends Funcionario {
  private double salario;
  private double comissao;

  public Vendedor(String nome, int matricula, double salarioBase, double comissao) {
    super(nome, matricula, salarioBase);

    setSalario(salarioBase);
    setComissao(comissao);
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getComissao() {
    return salario;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public void imprimeDados() {
    System.out.println("SALARIO DO VENDEDOR: " + salario);
  }

  @Override
  public void calculaSalario() {

    double salarioBase = super.getSalarioBase();
    double comissao = this.getComissao();
    this.salario = salarioBase + comissao;

  }
}
