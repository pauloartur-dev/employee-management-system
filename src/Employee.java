/**
 * Classe base para todos os funcionários.
 * Coloquei como abstract porque na vida real não existe um "Funcionário genérico",
 * ele sempre será um Gerente, Vendedor, etc.
 */
public abstract class Employee {
    private String code;
    private String name;
    private String address;
    private int age;
    protected double baseSalary; // protected para os filhos acessarem direto

    // Construtor padrão para facilitar a vida nas classes filhas
    public Employee(String code, String name, String address, int age, double baseSalary) {
        this.setCode(code);
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);
        this.baseSalary = baseSalary;
    }

    // Método abstrato: cada cargo terá sua própria regra de cálculo de salário
    public abstract double calculateSalary();

    // --- Getters e Setters com validações simples ---
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Idade não pode ser negativa!");
        this.age = age;
    }

    public double getBaseSalary() { return baseSalary; }
}