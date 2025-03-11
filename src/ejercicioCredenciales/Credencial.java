package ejercicioCredenciales;

import java.util.Objects;

public class Credencial {

	private String username;
	private String password;
	private static int secuencia;
	
	public Credencial(String nombre, String apellidos, String password) {
	
<<<<<<< HEAD
		this.username = nombre.substring(0, 2) + apellidos.substring(0, 2) + Integer.valueOf(secuencia++ + 100);
=======
		this.username = nombre.substring(0, 3) + apellidos.substring(0, 3) + Integer.valueOf(secuencia + 100);
>>>>>>> 68f97cb1805fb0649066feee1e8fa86cae548b25
		this.password = password;
		
	}
	
	public boolean comprobarPassword(String password) {
		return this.password.equals(password);
	}

	public String getUsername() {
		return username;
	}
	
	public boolean esPasswordSegura() {
		
<<<<<<< HEAD
		boolean esMinusc=false, esDigito=false;
=======
		boolean esMin=false, esDigito=false;
>>>>>>> 68f97cb1805fb0649066feee1e8fa86cae548b25
		
		for(int i=0; i<this.password.length(); i++ ) {
		if(Character.isDigit(this.password.charAt(i))) {
			esDigito=true;
		}else {
			if(Character.isLowerCase(this.password.charAt(i))) {
<<<<<<< HEAD
				esMinusc=true;
=======
				esMin=true;
>>>>>>> 68f97cb1805fb0649066feee1e8fa86cae548b25
			}
		}
		}
		
<<<<<<< HEAD
		return esDigito && esMinusc && this.password.length()>=8;
=======
		return esDigito && esMin && this.password.length()>=8;
>>>>>>> 68f97cb1805fb0649066feee1e8fa86cae548b25
	}
	
	public void setPassword(String newpass) {
		this.password = newpass;
	}

	@Override
	public String toString() {
		return "Credencial [username=" + this.username + ", password=" + "*".repeat(this.password.length()) + "]";
	}

	
	}
	
	
	


