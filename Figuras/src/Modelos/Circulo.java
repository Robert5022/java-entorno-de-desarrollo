package Modelos;
import java.util.*;

/**
 * 
 */
public class Circulo {
	 private double radio;
    
    public Circulo() {
    	  this.radio = 1;
    }
    public Circulo(double radio) {
    	        this.radio = radio;
    }

    public double getRadio() {
    	   return radio;
    	    }

    	public void setRadio(double radio) {
    	        this.radio = radio;
    	    }

    	    public double getArea() {
    	        return Math.PI * radio * radio;
    	    }

    	    public double getPerimetro() {
    	        return 2 * Math.PI * radio;
    	    }
    	}
    
    
    

