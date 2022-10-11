package tp2.Series;

import java.util.Scanner;

public class Temporada {

    private Episodio[] episodios;

    public Temporada(int cantEpisodios) {

        this.episodios = new Episodio[cantEpisodios];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < episodios.length; i++){
            System.out.println("ingrese 0 o 1: ");
            int varVisto = scanner.nextInt();
            this.episodios[i] = new Episodio("hola", "tetones", varVisto, 3);
        }

    }

    public void imprimirArr(){
        for(int i = 0; i < episodios.length; i++){
            System.out.println(episodios[i].getTitulo());
            System.out.println(episodios[i].getDescripcion());
            System.out.println(episodios[i].isVisto());
            System.out.println(episodios[i].getCalificacion());
        }
    }

    public int getVisto() {
        int cant = 0;
        for (int i = 0; i < episodios.length; i++) {
            if (episodios[i].isVisto() == 1) {
                cant++;
            }
        }
        return cant;
    }

    public double getPromedio() {
        double cant = 0;
        for (int i = 0; i < episodios.length; i++) {

                cant += episodios[i].getCalificacion();

        }
        return cant/ episodios.length;
    }

    public boolean  getVistosEpisodios() {
        if (getVisto() == episodios.length) {
            return true;
        }
        return false;
    }
}