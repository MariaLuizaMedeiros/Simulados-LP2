package CronicasDoEstudante;

public class CronicasDoEstudanteSistema {

		private Cronica[] cronicas;
		private static final int CRONICAS = 1000;
		private int registraCronica;
		private int indiceDoMaisLido;
		private int leiturasDoMaisLido = Integer.MIN_VALUE;
		private Livreto[] livretos;
		private int contadorDeLivretos;
		
		public CronicasDoEstudanteSistema() {
			cronicas = new Cronica[CRONICAS];
			livretos = new Livreto[100];
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
		
		public String listarCronicas() {
			String format = "";
			for(int i = 0; i < registraCronica; i++) {
				format += "Cronica #" + (i+1) + this.cronicas[i];
			}
			return format;
		}
		
		public String lerCronica(int indice) {
			Cronica c = this.cronicas[indice];
			c.contaLeituraCronica();
			return this.cronicas[indice].getTexto();
		}
		
		public void descobreMaior() {
			for(int i = 0; i < registraCronica; i++) {
				Cronica c = this.cronicas[i];
				int numeroDeLeituras = c.getContador();
				if (numeroDeLeituras > leiturasDoMaisLido) {
					leiturasDoMaisLido = numeroDeLeituras;
					indiceDoMaisLido = i;
				}
			}
		}
		
		public String exibirCronicaMaisLida() {
			String maisLido = this.cronicas[indiceDoMaisLido].getTitulo();
			return maisLido + "- lida" + leiturasDoMaisLido + "vezes";
		}
		
		public String criarLivreto(int[] indiceCronicas){
			if (indiceCronicas.length < 3 || indiceCronicas.length > 5) {
					return "“Erro ao criar Livreto!";
				}
			Livreto novo = new Livreto(indiceCronicas.length);			
			for(int i = 0; i < indiceCronicas.length; i++ ) {
				Cronica c = this.cronicas[i];
				novo.cadastraCronica(c);
				novo.recebeIndicesReais(i);
			}
			this.livretos[contadorDeLivretos] = novo;
			contadorDeLivretos++;
			if (contadorDeLivretos == 101) {
				contadorDeLivretos = 0;
			}
			return null;
		}
		
		public boolean contemCronicaNoLivreto(String titulo, int j) {
			Cronica[] cronicasDoLivreto = this.livretos[j].getCronicas();
			for(int i = 0; i < cronicasDoLivreto.length; i++) {
				if(cronicasDoLivreto[i] != null) {
					String tituloCronica = cronicasDoLivreto[i].getTitulo();
					if (titulo.equals(tituloCronica)) {
						return true;
					}
				}
			}
			return false;
		}
		
		public String lerLivreto(int i){
			Livreto l = this.livretos[i];
			int[] listaIndices = l.retornaIndicesReais();
			for(int j = 0; j < listaIndices.length; j++) {
				if(listaIndices != null) {
					lerCronica(listaIndices[j]);
				}
			}
			return null;
		}	
}
