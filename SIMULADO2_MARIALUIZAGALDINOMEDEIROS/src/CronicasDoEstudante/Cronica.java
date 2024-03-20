package CronicasDoEstudante;

public class Cronica {

	private String titulo;
	private String texto;
	private String autor;
	private String data;
//	private int contaLeitura;
	
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
	
	public String getTitulo(String titulo) {
		return this.titulo;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n%s\n%s\n%s", titulo, data, autor, texto);
	}
	
//	public void adicionaCronica() {
//		contaLeitura++;
//	}
}
