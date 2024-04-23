package Test;
import Models.Persona;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPersona {
	

@Test	
void metodoNumero1(){
	Persona persona = new Persona("Fran","Tequiero",-1);
	String esperado="Menor de edad";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero0(){
	Persona persona = new Persona("Fran","Tequiero",0);
	String esperado="Menor de edad";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero17(){
	Persona persona = new Persona("Fran","Tequiero",17);
	String esperado="Menor de edad";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero18(){
	Persona persona = new Persona("Fran","Tequiero",18);
	String esperado="Mayor de edad";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero65(){
	Persona persona = new Persona("Fran","Tequiero",65);
	String esperado="Mayor de edad";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero66(){
	Persona persona = new Persona("Fran","Tequiero",66);
	String esperado="Jubilado";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}
@Test	
void metodoNumero130(){
	Persona persona = new Persona("Fran","Tequiero",130);
	String esperado="Jubilado";
	String obtenido= persona.mostrarEdad();
	assertEquals(esperado,obtenido);
}


/**
 * Comprueba que al intentar instanciarse una persona con edad negativa se lanza la excepcion esperada
 */
@Test	
 void constructorMenosLimitie(){
	Exception ex=assertThrows(IllegalArgumentException.class,() -> new Persona("Fran", "Daniela",-1));
	String mensaje = "La edad tiene que estar entre 0 y 130";
	assertEquals(mensaje,ex.getMessage());
}
@Test	
void constructorMayorLimitie(){
	Exception ex=assertThrows(IllegalArgumentException.class,() -> new Persona("Fran", "Daniela",131));
	String mensaje = "La edad tiene que estar entre 0 y 130";
	assertEquals(mensaje,ex.getMessage());
}
}
