package tp8.ej1;

import tp8.ej1.Filtros.Filtro;
import tp8.ej1.Filtros.FiltroNot;
import tp8.ej1.Filtros.FiltroPago;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Club c1 = new Club("club1");

        Socio s1 = new Socio("juan", "ferez", 25, false);
        Socio s2 = new Socio("juan1", "berez", 25, false);
        Socio s3 = new Socio("ariel", "berez", 25, true);
        Socio s4 = new Socio("juan3", "aerez", 25, false);


        //Alquiler al1 = new Alquiler();

        c1.addSocio(s1);
        c1.addSocio(s2);
        c1.addSocio(s3);
        c1.addSocio(s4);
        //ArrayList<Socio> sociosMorosos = c1.getSocios();
       // Collections.sort(sociosMorosos, new ComparadorApellido());

        Filtro filtroMorosos = new FiltroPago();
        Filtro filtroNot = new FiltroNot(filtroMorosos);

        ArrayList<Socio> sociosMorosos = c1.getSocios(filtroNot);
        System.out.println(sociosMorosos);

        ComparadorApellido compApellido = new ComparadorApellido();
        ComparadorNombre compNombre = new ComparadorNombre();

        Collections.sort(sociosMorosos, new ComparadorCompuesto(compApellido, compNombre));

        System.out.println(sociosMorosos);

        //System.out.println(sociosMorosos1);

        Alquiler al1 = new Alquiler(LocalDate.of(2016,01,01), 900.00, 1);
        Alquiler al2 = new Alquiler(LocalDate.of(2016,01,01), 800.00, 2);
        Alquiler al3 = new Alquiler(LocalDate.of(2016,01,01), 400.00, 3);
        s1.addAlquiler(al1);
        s1.addAlquiler(al2);
        s2.addAlquiler(al3);
        s3.addAlquiler(al2);
        s4.addAlquiler(al2);

        ArrayList<Socio> sociosMas500 = c1.getSocios();
        // System.out.println("socios que pagaron mas de 500" + sociosMas500);
        //System.out.println("------------------------------------------------------");
        Collections.sort(sociosMas500,new ComparadorCompuesto(new ComparadorCuota(), new ComparadorApellido()));

        //System.out.println("socios que pagaron mas de 500 ordenados" +sociosMas500);

    }
}
