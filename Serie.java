
public class Serie {
	private String titulo;
	private int numTemp;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		super();
		this.titulo = "";
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
	}

	public Serie(String titulo, int numTemp, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}
