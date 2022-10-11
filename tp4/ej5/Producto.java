package tp4.ej5;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

    private LocalDate fechaVencimento;
    private long nroLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;


    public Producto(LocalDate fechaVencimento, long nroLote, LocalDate fechaEnvasado, String granjaOrigen) {

        setFechaVencimento(fechaVencimento);
        setNroLote(nroLote);
        setFechaEnvasado(fechaEnvasado);
        setGranjaOrigen(granjaOrigen);

    }

    public LocalDate getFechaVencimento() {
        return fechaVencimento;
    }

    public void setFechaVencimento(LocalDate fechaVencimento) {
        this.fechaVencimento = fechaVencimento;
    }

    public long getNroLote() {
        return nroLote;
    }

    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return nroLote == producto.nroLote && Objects.equals(fechaVencimento, producto.fechaVencimento) && Objects.equals(fechaEnvasado, producto.fechaEnvasado) && granjaOrigen.equals(producto.granjaOrigen);
    }

}
