package model;

public class Romancero extends Agrupacion implements Callejera{

	private String TematicaCartelon;

	public Romancero() {
		super();
	}
	
	public String getTematicaCartelon() {
		return TematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		TematicaCartelon = tematicaCartelon;
	}
	
	@Override
	public String toString() {
		return "Romancero: " + super.toString() + " Temática del Cartelón: " + getTematicaCartelon();
	}

	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Romancero ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "El Romancero " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}

	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá el Romancero ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
