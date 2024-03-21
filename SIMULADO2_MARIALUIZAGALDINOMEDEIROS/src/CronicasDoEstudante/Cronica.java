package CronicasDoEstudante;

import java.util.Objects;

public class Cronica {

	private String titulo;
	private String texto;
	private String autor;
	private String data;
	private int contaLeitura;
	
	public Cronica(String titulo, String texto, String data, String autor) {
		this.autor = autor;
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}
	
	public Cronica(String titulo, String texto, String data) {
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
		autor = "Anônimo";
	}
	
	@Override
	public String toString() {
		return String.format("%s\nData: %s\nAutor: %s\n%s", titulo, data, autor, texto);
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void contaLeituraCronica() {
		contaLeitura++;
	}
	
	public int getContador() {
		return contaLeitura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cronica other = (Cronica) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
}
