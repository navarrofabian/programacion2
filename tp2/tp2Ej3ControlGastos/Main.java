package tp2.tp2Ej3ControlGastos;

public class Main {
    public static void main(String[] args){

        Impuesto imp1 = new Impuesto("impuestoARespirar", 15000.0);
        Impuesto imp2 = new Impuesto("impuestoACaminar", 25000.0);
        Impuesto imp3 = new Impuesto("impuesto345", 10000.0);
        Impuesto imp4 = new Impuesto("impuesto654", 75000.0);
        Impuesto imp5 = new Impuesto("impuesto655", 35000.0);

        Ciudad Ciudad1 = new Ciudad("Tandil", 150000, 100000.0);
        Ciudad Ciudad2 = new Ciudad("Azul", 100000, 100000.0);

        Provincia Provincia1 = new Provincia("Buenos Aires");

        Pais p1 = new Pais("PaisA");

        for (int i = 0; i <p1.getProvincias().size(); i++) {
            Provincia Provincia = p1.getProvincias().get(i);
            System.out.println(Provincia);
        }

    }
}
