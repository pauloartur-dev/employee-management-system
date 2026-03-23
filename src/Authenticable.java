/**
 * Interface para padronizar quem pode acessar áreas restritas do sistema.
 * Escolhi usar interface aqui para separar a lógica de autenticação da hierarquia de classes.
 */
public interface Authenticable {
    boolean login(String username, String password);
}

