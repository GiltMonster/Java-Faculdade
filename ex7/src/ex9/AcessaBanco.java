package ex9;

public class AcessaBanco {

    private String login;
    private boolean conectado;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public AcessaBanco() {
    }

    public AcessaBanco(String login) {
        this.login = login;
    }
}
