package tp9.ej4.filtros;

import tp9.ej4.SeguroSimple;

public class FiltroDni extends Filtro{

    private int dni;

    public FiltroDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getDni() == dni;
    }
}
