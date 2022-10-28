import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Vendedor b = new Vendedor("Pedrinho", 1234, 1000, 2000);

    System.out.println("Digite os dados do gerente: ");
    System.out.println("Nome");
    String nome = input.next();
    System.out.println("Matricula");
    int matricula = input.nextInt();
    System.out.println("SalarioBase");
    int salarioBase = input.nextInt();

    Gerente a = new Gerente(nome, matricula, salarioBase);

    a.calculaSalario();
    a.imprimeDados();

    b.calculaSalario();
    b.imprimeDados();

    input.close();
  }
}
