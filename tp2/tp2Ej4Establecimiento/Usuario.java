package tp2.tp2Ej4Establecimiento;

public class Usuario {

    private String username;
    private boolean esSocio;

    public Usuario(String username) {
        setUsername(username);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void hacerSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
}
