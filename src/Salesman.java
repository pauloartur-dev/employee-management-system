/**
 * Classe Vendedor: o salário final depende do quanto ele vendeu no mês.
 */
public class Salesman extends Employee {
    private double percentPerSold;
    private double totalSales;

    public Salesman(String code, String name, String address, int age, double baseSalary, double percentPerSold) {
        super(code, name, address, age, baseSalary);
        this.percentPerSold = percentPerSold;
    }

    // Polimorfismo: a regra de cálculo aqui é totalmente diferente do Gerente
    @Override
    public double calculateSalary() {
        double commissionValue = (this.totalSales * (this.percentPerSold / 100));
        return this.baseSalary + commissionValue;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}
