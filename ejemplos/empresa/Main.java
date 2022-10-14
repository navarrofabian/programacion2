package ejemplos.empresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Empleado juan = new Empleado("juan", "perez", "PHP", 70000.00);
        Empleado pablo = new Empleado("pablo", "perez", "Java", 70000.00);
        Empleado pedro = new Empleado("pedro", "perez", "js", 70000.00);
        Empleado juan2 = new Empleado("juan2", "perez", "js", 70000.00);
        Empleado luis = new Empleado("luis", "perez", "js", 70000.00);

        Grupo g1 = new Grupo("backend");

        g1.addElemento(juan);
        g1.addElemento(pedro);

        Grupo g2 = new Grupo("Frontend");

        g1.addElemento(pablo);
        g1.addElemento(juan2);

        Grupo g3 = new Grupo("Investigacion");

        g3.addElemento(juan2);


        Grupo sucTandil = new Grupo("SucTandil");
        sucTandil.addElemento(g1);
        sucTandil.addElemento(g2);
        sucTandil.addElemento(luis);

        Grupo sucBuenosAires = new Grupo("suc Buenos Aires");
        sucBuenosAires.addElemento(g3);


        Grupo empresa = new Grupo("empresa1");

        empresa.addElemento(sucTandil);
        empresa.addElemento(sucBuenosAires);
        empresa.addElemento(new Empleado("Ariel", "Montes", "jefe", 500000));

        System.out.println("cantidad de empleados de la empresa: " + empresa.cantEmpleados());

        ArrayList<Empleado> empleadosJs = empresa.empleadosConEsp("js");

        System.out.println(empleadosJs);





    }
}

