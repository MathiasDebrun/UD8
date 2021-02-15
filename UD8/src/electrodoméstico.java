
class electrodomestico {
	protected final double PRECIOBASE=100;			//Atributos
	protected final String COLOR="blanco";
	protected final char CONSUMO='F';
	protected final double PESO=5;
	protected double precio=PRECIOBASE;
	protected String color=COLOR;
	protected char consumo=CONSUMO;
	protected double peso=PESO;
	
	protected final String Colores[]= {"blanco","negro","azul","gris"}; //Arrays que usaremos para comprobar si los colores y/o consumo están bien agregados.
	protected final char Consumo[]= {'A','B','C','D','E','F'};
	
	

	public electrodomestico(double precio, String color, char consumo, double peso) {   //Constructor con todos los atributos.
		boolean correcto=false;
		for (int i = 0; i < Colores.length; i++) {										//Si el color ingresado no está en la lista, lo seteamos al color por defecto.
			if (color.equalsIgnoreCase(Colores[i])) {
				correcto=true;
			} 
			
		}
		if (correcto) {
				this.color = color;
			} else {
				this.color=COLOR;
			}
		this.precio = precio;
		correcto=false;
		for (int i = 0; i < Consumo.length; i++) {										//Si el consumo ingresado no está en la lista, lo seteamos al consumo por defecto.
			if (consumo==Consumo[i]) {
				correcto=true;
			} 
		}
		 if (correcto) {
			this.consumo = consumo;
		} else {
			this.consumo=CONSUMO;
		}
		
		this.peso = peso;
	}

	public electrodomestico(double precio, double peso) {								//Constructor en el que solo pedimos el precio y el peso.
		
		this.precio = precio;
		this.peso = peso;
	}

	public electrodomestico() {														  //Constructor por defecto.
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}
	
	
	
}
