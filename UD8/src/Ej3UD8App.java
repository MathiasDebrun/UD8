
public class Ej3UD8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		electrodomestico a=new electrodomestico();                      //Creamos un electrodoméstico con cada parámetro.
		electrodomestico b=new electrodomestico(180,5);
		electrodomestico c=new electrodomestico(145,"Negro",'A',6);
		electrodomestico d=new electrodomestico(145,"lila",'z',6);
		
		System.out.println(a.toString());                              //Le mostramos al usuario los objetos creados.
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		
	}

}
