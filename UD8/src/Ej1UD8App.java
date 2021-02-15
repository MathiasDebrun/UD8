
public class Ej1UD8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Mathias=new Persona("Mathias", 23,"1234556M",'H',90,180);   //Creamos una nueva persona por cada constructor.
		Persona Debrun=new Persona("Mathias", 23,'H');
		Persona Charles=new Persona();
		System.out.println(Mathias.toString());
		System.out.println(Debrun.toString());
		System.out.println(Charles.toString());
		
	}

}
