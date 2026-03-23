import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criei uma lista de Employee. Isso permite tratar objetos diferentes de forma igual.
        List<Employee> staff = new ArrayList<>();

        // Instanciando objetos (Polimorfismo: tratando Manager como Employee)
        Manager paulo = new Manager("M-01", "Paulo Artur", "Mossoró-RN", 20, 5500.0, 2000.0);
        
        Salesman joao = new Salesman("V-01", "João Silva", "Natal-RN", 25, 1800.0, 10.0);
        joao.setTotalSales(50000.0); // João vendeu 50k, vai ganhar 10% disso (5k)

        staff.add(paulo);
        staff.add(joao);

        System.out.println("==========================================");
        System.out.println("   FOLHA DE PAGAMENTO - PROJETO UFERSA    ");
        System.out.println("==========================================");

        for (Employee e : staff) {
            System.out.println("ID: " + e.getCode());
            System.out.println("Nome: " + e.getName());
            
            // O Java descobre sozinho qual calculateSalary rodar em tempo de execução
            System.out.printf("Salário a Receber: R$ %.2f\n", e.calculateSalary());
            System.out.println("------------------------------------------");
        }
    }
}