import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa(new ArrayList<>());
        
        cadastrarFuncionario(scanner , empresa, 1, 10000);
        cadastrarFuncionario(scanner, empresa, 24, 1000);
        cadastrarFuncionario(scanner, empresa, 13, 5000);

        empresa.toStringlistarFuncionarios();
        empresa.calcularFolhaSalarial();

        scanner.close();
    }

    public static void cadastrarFuncionario(Scanner scanner, Empresa empresa, int id, double salarioBase) {
        System.out.println("Cadastro do Funcionário:");
        Funcionario funcionario = lerDadosFuncionarios(scanner, id, salarioBase);
        empresa.addFuncionario(funcionario);
    }

    public static Funcionario lerDadosFuncionarios(Scanner scanner, int id, double salarioBase) {
        System.out.println("Informe o nome do Funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Informe o cargo do Funcionário (DESENVOLVEDOR / SUPORTE / GERENTE):");
        String cargo = scanner.nextLine().toUpperCase();

        double salarioComBonus;
        switch (cargo) {
            
                case "DESENVOLVEDOR":
                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, id, salarioBase);
                salarioComBonus = desenvolvedor.calcularSalario(salarioBase); 
                desenvolvedor.setSalario(salarioComBonus); 
                return desenvolvedor;
            
                case "SUPORTE":
                Suporte suporte = new Suporte(nome, id, salarioBase);
                salarioComBonus = suporte.calcularSalario(salarioBase);
                suporte.setSalario(salarioComBonus);
                return suporte;
            
                case "GERENTE":
                Gerente gerente = new Gerente(nome, id, salarioBase);
                salarioComBonus = gerente.calcularSalario(salarioBase);
                gerente.setSalario(salarioComBonus);
                return gerente;
            
            default:
                throw new IllegalArgumentException("\nCargo inválido: " + cargo);
        }
    }
}



