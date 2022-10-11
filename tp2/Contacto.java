package tp2;

public class Contacto {
    private String name;
    private String email;
    private long phone;
    private boolean asistent;

    public Contacto(String name, String email, long phone, boolean asistent) {
        setName(name);
        setEmail(email);
        setPhone(phone);
        setAsistent(asistent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public boolean isAsistent() {
        return asistent;
    }

    public void setAsistent(boolean asistent) {
        this.asistent = asistent;
    }
}
