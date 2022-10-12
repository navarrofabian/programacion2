package ejemplos.farmacia;

import java.util.ArrayList;

import ejemplos.farmacia.filtros.Filtro;
import ejemplos.farmacia.filtros.FiltroLaboratorio;
import ejemplos.farmacia.filtros.FiltroOr;

public class Main {

	public static void main(String[] args) {

		Farmacia farmacity = new Farmacia();
		
		Medicamento m1 = new Medicamento("Seba","bayer",5);
		Medicamento m2 = new Medicamento("Martin","janvier",10);
		Medicamento m3 = new Medicamento("Juan","milaboratorio",15);
		
		m1.addSintoma("dolor de garganta");
		m1.addSintoma("tos");
		m2.addSintoma("fiebre");
		m3.addSintoma("dolor de garganta");
		
		farmacity.addMedicamento(m1);
		farmacity.addMedicamento(m2);
		farmacity.addMedicamento(m3);
		
		Paciente p = new Paciente();
		p.addSintoma("tos");
		
		System.out.println(p.leSirve(m1));
		System.out.println(p.leSirve(m2));

		Filtro f1 = new FiltroLaboratorio("bayer");
		Filtro f2 = new FiltroLaboratorio("janvier");
		Filtro f = new FiltroOr(f1,f2);
		
		ArrayList<Medicamento> resultado = farmacity.buscar(f);
		
		System.out.println(resultado);
	}

}
