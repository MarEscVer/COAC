package model;

public abstract class Agrupacion implements Comparable<Agrupacion>{

	private String nombre;
	private String autor_musica;
	private String autor_letra;
	private String autor;
	private String tipo;
	private static Integer numAgrupaciones = 0;

	public Agrupacion() {
		numAgrupaciones ++;
		setNumAgrupaciones(numAgrupaciones);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor_musica() {
		return autor_musica;
	}

	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}

	public String getAutor_letra() {
		return autor_letra;
	}

	public void setAutor_letra(String autor_letra) {
		this.autor_letra = autor_letra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumAgrupaciones() {
		return numAgrupaciones;
	}
	
	private Integer setNumAgrupaciones(Integer numAgrupaciones) {
		return Agrupacion.numAgrupaciones = numAgrupaciones;
	}

	public abstract String cantarPresentacion();
	
	public abstract String hacerTipo();
	
	@Override
	public String toString() {
		return " Nombre: " + getNombre() + ", Autor: " + getAutor() + ", Autor de Música: " + getAutor_musica()
				+ ", Autor de Letras: " + getAutor_letra() + ", Tipo: " + getTipo();
	}

	@Override
	public int compareTo(Agrupacion a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
