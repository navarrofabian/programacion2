package tp5.ej2;

import java.util.ArrayList;

public class CasaSangrePura extends Casa {

    public CasaSangrePura(int maxIntegrantes) {

        super(maxIntegrantes);
    }

    @Override
    public void addAlumno(Alumno a1){
        if(tieneFamiliar(a1)){
            super.addAlumno(a1);
        }
    }

    public boolean tieneFamiliar(Alumno a){
        boolean result = false;
        for(Alumno f : integrantes){
            if (f.getApellido().equals(a.getApellido())) {
                result = true;
                break;
            }
        }
        return result;
    }

}
