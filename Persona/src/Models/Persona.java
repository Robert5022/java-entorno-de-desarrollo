package Models;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		if (edad<0 || edad>130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130");
			
		}

		this.nombre= nombre;
		this.apellidos=apellidos;
		this.edad = edad;
				
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad() {
		this.edad = edad;
	}
	
	public String mostrarEdad() {
		String frase = " ";
		if(this.edad<18) {
			frase= "Menor de edad";
		}
		else if(this.edad<18 && this.edad>65){
			frase= "Mayor de edad";
		}
		else {
			frase= "Es jubilado";
		}
		return frase;
	}
	
	

}
