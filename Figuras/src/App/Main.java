package App;
import Modelos.Rectangulo;
public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);

		int area1 = r1.area();
		System.out.println("Area rectangulo:" + area1);
		int perimetro2 = r2.perimetro();
		System.out.println("Perimetro del rectangulo:" + perimetro2);
	}

}
