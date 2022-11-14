package tp8.ej3Navidad;


public class Ninio {
    private String barrio, localidad, pais;
    private long dni;


    public Ninio(long dni) {
        this.setDni(dni);
        this.setBarrio(barrio);
        this.setLocalidad(localidad);
        this.setPais(pais);
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Ninio otro = (Ninio) obj;
            return this.getDni() == otro.getDni();
        } catch (Exception e){
            return false;
        }
    }

}
