import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;   
    
    public Empresa(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
  
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void toStringlistarFuncionarios() {
        System.out.println("\nLista de funcionários:");
        for (Funcionario funcionario : this.funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void calcularFolhaSalarial() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }
        System.out.println("\nFolha salarial total: " + formatarSalario(totalSalarios));
    }

    public String formatarSalario(double salario) {
        return String.format("%.2f", salario);
    }
}


