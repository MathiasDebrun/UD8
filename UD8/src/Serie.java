
public class Serie {
      protected final int NUMTEMP=3;
      protected final boolean ENTREGADO=false;
	  protected String titulo="";
      protected int ntemp=NUMTEMP;
      protected boolean entregado=ENTREGADO;
      protected String genero="";
      protected String creador="";
	
      public Serie(String titulo, int ntemp, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.ntemp = ntemp;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie() {
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", ntemp=" + ntemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
      
      
}
