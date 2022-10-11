package tp6.ej2;


import java.util.ArrayList;

/*
2. Centro de Cómputos
Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas.
 */
public class CentroComputo {
    private ColaEspera computadoras;
    private ColaEspera procesos;


    public CentroComputo(){
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void addPC(Computadora pc){
        if(pc == null) return;
        if(procesos.tieneElementos()){
            Proceso p = (Proceso) procesos.getSiguiente();
            pc.ejecutarProceso(p);
        }
       else computadoras.addElemento(pc);

    }
    public void addProceso(Proceso proceso){
        if(proceso == null) return;
        if(computadoras.tieneElementos()){
            Computadora libre = (Computadora) computadoras.getSiguiente();
            libre.ejecutarProceso(proceso);
        }
        else{
            procesos.addElemento(proceso);
        }
    }

    public Computadora getSiguientePC(){
        return (Computadora)computadoras.getSiguiente();
    }

    public Proceso getSiguienteProc(){
        return (Proceso)procesos.getSiguiente();
    }


}
