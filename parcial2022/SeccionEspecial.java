package parcial2022;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial  extends NoticiaCompuesta{
    private String categoriaFija;
    private int cantRet;


    @Override
    public String getCategoria() {
      return categoriaFija;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> aux = super.getPalabrasClaves();
        Collections.sort(aux);
        ArrayList<String> result = new ArrayList<String>();
        for( int i = 0; i < aux.size() && i < cantRet; i++ ){
            result.add(aux.get(i));
        }
        return result;
    }

}
