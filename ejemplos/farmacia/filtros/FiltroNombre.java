package ejemplos.farmacia.filtros;

import ejemplos.farmacia.Medicamento;

public class FiltroNombre extends Filtro {

	private String nombreBuscado;
	
	public FiltroNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}
	
	@Override
	public boolean cumple(Medicamento medic) {
		return medic.getNombre().equals(this.nombreBuscado);
	}

}
