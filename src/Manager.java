/**
 * Classe Gerente: herda de Employee e implementa Authenticable.
 * Aqui apliquei Herança e Interfaces simultaneamente.
 */
public class Manager extends Employee implements Authenticable {
    private String login;
    private String password;
    private double commission;

    public Manager(String code, String name, String address, int age, double baseSalary, double commission) {
        super(code, name, address, age, baseSalary);
        this.commission = commission;
    }

    // Sobrescrita do cálculo: Salário base + Comissão fixa de cargo
    @Override
    public double calculateSalary() {
        return this.baseSalary + this.commission;
    }

    // Implementação obrigatória da interface de login
    @Override
    public boolean login(String username, String password) {
        return this.login.equals(username) && this.password.equals(password);
    }

    // Getters e Setters específicos
    public void setAuth(String login, String password) {
        this.login = login;
        this.password = password;
    }
}