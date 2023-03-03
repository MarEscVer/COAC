package model;

/**
 * <h2>Clase Chirigota, se utiliza para crear Chirigotas para su posterior gestión</h2>
 * @author maria
 * @since 22-02-2022
 */
public class Comparsa extends AgrupacionOficial {
 
	private String empresaAtrezo;

	public Comparsa() {
		super();
	}

	public String getEmpresaAtrezo() {
		return empresaAtrezo;
	}

	public void setEmpresaAtrezo(String empresaAtrezo) {
		this.empresaAtrezo = empresaAtrezo;
	}

	@Override
	public String toString() {
		return "Comparsa: " + super.toString() + " Empresa de atrezo: " + getEmpresaAtrezo();
	}

	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación de la Comparsa ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}

	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "La Comparsa " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}
	
	@Override
	public String caminitoDelFalla() {
		String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "La Comparsa " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "La Comparsa va caminito del Falla";
			}
		return mensaje;
	}

}
