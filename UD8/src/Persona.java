
public class Persona {

	
	private String nombre="";
	private int edad=0;
	private final String DNI_DEF="1234567A";
	private String DNI=DNI_DEF;
	private final char SEXO='H';
	private char sexo=SEXO;
	private double peso=0.0;
	private double altura=0.0;
	
	public Persona() {
		
	}

	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI_DEF=" + DNI_DEF + ", DNI=" + DNI + ", SEXO="
				+ SEXO + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}

	
	
}	