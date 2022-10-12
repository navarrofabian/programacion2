package ejemplos.farmacia.filtros;

import ejemplos.farmacia.Medicamento;

public class FiltroNot extends Filtro {

	private Filtro filtroANegar;
	
	public FiltroNot(Filtro filtroANegar) {
		this.filtroANegar = filtroANegar;
	}
	
	@Override
	public boolean cumple(Medicamento medic) {
		return ! this.filtroANegar.cumple(medic);
	}

}
