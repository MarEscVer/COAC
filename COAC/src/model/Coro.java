package model;

public class Coro extends AgrupacionOficial{

	private Integer bandurrias;
	private Integer guitarras;
	
	public Coro() {
		super();
	}
	
	public Integer getBandurrias() {
		return bandurrias;
	}
	public void setBandurrias(Integer bandurrias) {
		this.bandurrias = bandurrias;
	}
	public Integer getGuitarras() {
		return guitarras;
	}
	public void setGuitarras(Integer guitarras) {
		this.guitarras = guitarras;
	}

	@Override
	public String toString() {
		return "Coro: " + super.toString() + " Número de Bandurrias: " + getBandurrias() + ", Número de Guitarras: " + getGuitarras();
	}

	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Coro ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}

	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "El Coro " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}

	@Override
	public String caminitoDelFalla() {
		String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "El Coro " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "El Coro va caminito del Falla";
			}
		return mensaje;
	}
	
}
