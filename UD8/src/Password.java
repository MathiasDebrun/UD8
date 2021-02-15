
public class Password {
	private final int LONGITUD=8;
	private int longitud=8;
	private String contraseña;
	
	public Password() {
		this.contraseña=generarcontraseña(longitud);
	}

	public Password(int longitud) {
		this.contraseña=generarcontraseña(longitud);
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}


	public String generarcontraseña(int longitud) {
		String pass="";
		 // String con caracteres
      String CadenaLetrasNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                  + "0123456789"
                                  + "abcdefghijklmnopqrstuvxyz"; 

      // Creamos un StringBuilder de tantos caracteres como la long de la pass
      StringBuilder newPass = new StringBuilder(longitud); 

      for (int i = 0; i < longitud; i++) { 

          // numero random entre 0 y la longitud maxima
          int index = (int)(CadenaLetrasNum.length()* Math.random()); 

          // añadimos el caracter escojido a la pass
          newPass.append(CadenaLetrasNum.charAt(index)); 
      } 

      pass= newPass.toString(); 
		return pass;
	}
}
