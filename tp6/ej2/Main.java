package tp6.ej2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        CentroComputo centro = new CentroComputo();

        Computadora pc1 =  new Computadora(5.5, "ryzen5");
        Computadora pc2 =  new Computadora(5.7, "ryzen9");
        Computadora pc3 =  new Computadora(5.2, "ryzen7");

        centro.addPC(pc1);
        centro.addPC(pc2);
        centro.addPC(pc3);
    }
}
