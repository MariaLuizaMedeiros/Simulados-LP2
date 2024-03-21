package CronicasDoEstudante;

public class Livreto {
	
	private int tamanho;
	private Cronica[] cronicas;
	private int contadorCronica;
	private int[] indicesReaisDasCronicas;
	
	public Livreto(int tamanho) {
		this.tamanho = tamanho;
		cronicas = new Cronica[this.tamanho];
		indicesReaisDasCronicas = new int[this.tamanho];
	}
	
	public void cadastraCronica(Cronica cronica) {
		this.cronicas[contadorCronica] = cronica;
		contadorCronica++;		
	}
	
	public Cronica[] getCronicas() {
		return this.cronicas.clone();
	}
	
	public void recebeIndicesReais(int indice) { // array com os indices reais das cronicas
		this.indicesReaisDasCronicas[contadorCronica-1] = indice;
	}
	
	public int[] retornaIndicesReais() {
		return this.indicesReaisDasCronicas;
	}
}
