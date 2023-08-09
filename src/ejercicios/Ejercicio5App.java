package ejercicios;

public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 4;
		int c = 2;
		int d = 5;
		b = c;
		c = a;
		a = d;
		d = b;
		System.out.println("B toma el valor de C: " + b);
		System.out.println("C toma el valor de A: " + c);
		System.out.println("A toma el valor de D: " + a);
		System.out.println("D toma el valor de B: " + d);
	}

}
