package tp2.Series;
public class Main {

    public static void main(String[] args) {

        Serie serie2 = new Serie (3, "bb serie", "soy trolon", "director pablito", "no binarie");

        //Temporada temporada1 = new Temporada(3 );

        //serie2.imprimirSerie();
        System.out.println(serie2.getPromedio(-1));

        if(serie2.vioTodos() == true){
            System.out.println("se la comio todaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
        else{
            System.out.println("no puede rinde obj");
        }


    }
}