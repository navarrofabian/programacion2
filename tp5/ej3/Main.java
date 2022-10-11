package tp5.ej3;

public class Main {
    public static void main(String[] args){

        Cooperativa coop1 = new Cooperativa("Cooperativa Tandil");

        Lote lot1 = new Lote(25, 100.00);

        System.out.println( coop1.esEspecial(lot1));
    }
}
