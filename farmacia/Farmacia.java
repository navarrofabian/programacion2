package farmacia;

import java.util.ArrayList;
import java.util.Collections;

import farmacia.filtros.Filtro;

public class Farmacia {

	private ArrayList<Medicamento> medicamentos;
	private Filtro filtroDescuento;
	
	public Farmacia() {
		this.medicamentos = new ArrayList<>();
		this.filtroDescuento = null;
	}
	
	public void setFiltroDescuento(Filtro filtroDescuento) {
		this.filtroDescuento = filtroDescuento;
	}
	
	public void addMedicamento(Medicamento m) {
		this.medicamentos.add(m);
	}
	
	public ArrayList<Medicamento> buscar(Filtro filtro) {
		ArrayList<Medicamento> resultado = new ArrayList<>();
		
		for (int index = 0; index < this.medicamentos.size(); index++) {
			Medicamento med = this.medicamentos.get(index);
			if (filtro.cumple(med)) {
				resultado.add(med);
			}
		}
		
		Collections.sort(resultado);
		
		return resultado;
	}
	
	public boolean tieneDescuento(Medicamento medic) {
		if (this.filtroDescuento != null)
			return this.filtroDescuento.cumple(medic);
		else 
			return false;
	}
	
}
