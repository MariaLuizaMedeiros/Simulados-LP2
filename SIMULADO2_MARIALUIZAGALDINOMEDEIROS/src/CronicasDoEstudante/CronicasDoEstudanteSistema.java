package CronicasDoEstudante;

public class CronicasDoEstudanteSistema {

		private Cronica[] cronicas;
		private static final int CRONICAS = 1000;
		private int registraCronica;
		
		public CronicasDoEstudanteSistema() {
			cronicas = new Cronica[CRONICAS];
		}
		
		public void cadastrarCronica(String titulo, String texto, String data, String autor) {
			Cronica cronica = new Cronica(titulo, texto, data, autor);
			this.cronicas[registraCronica] = cronica;
			registraCronica++;
		}
		
		public void cadastrarCronica(String titulo, String texto, String data) {
			Cronica cronica = new Cronica(titulo, texto, data);
			this.cronicas[registraCronica] = cronica;
			registraCronica++;
		}
		
		public String getCronica(int posicao) {
			return this.cronicas[posicao].toString();
		}
		
//		public String listarCronicas() {
//				
//		}
		
//		public String lerCronica(int indice) {
//			
//		}
}
