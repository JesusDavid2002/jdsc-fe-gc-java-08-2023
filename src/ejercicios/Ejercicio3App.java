package ejercicios;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 5;
		double n = 12.4;
		double m = 6.7;
		System.out.println("----------------------");
		System.out.println("Valores: ");
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		System.out.println("Valor de n: " + n);
		System.out.println("Valor de m: " + m);
		System.out.println("----------------------");
		System.out.println("Operaciones X e Y: ");
		int suma = x + y;
		int resta = x - y;
		int multi = x * y;
		int div = x / y;
		int resto = x % y;
		System.out.println("Suma de "+ x + " + " + y + " = " + suma);
		System.out.println("Resta de "+ x + " - " + y + " = " + resta);
		System.out.println("Multiplicación de "+ x + " * " + y + " = " + multi);
		System.out.println("División de "+ x + " / " + y + " = " + div);
		System.out.println("Módulo de "+ x + " % " + y + " = " + resto);
		System.out.println("----------------------");
		System.out.println("Operaciones N y M: ");
		double suma2 = n + m;
		double resta2 = n - m;
		double multi2 = n * m;
		double div2 = n / m;
		double resto2 = n % m;
		System.out.println("Suma de "+ n + " + " + m + " = " + suma2);
		System.out.println("Resta de "+ n + " - " + m + " = " + resta2);
		System.out.println("Multiplicación de "+ n + " * " + m + " = " + multi2);
		System.out.println("División de "+ n + " / " + m + " = " + div2);
		System.out.println("Módulo de "+ n + " % " + m + " = " + resto2);
		System.out.println("----------------------");
		System.out.println("Operaciones varias: ");
		double suma3 = x + n;
		double div3 = y / m;
		double resto3 = y % m;
		double totalSuma = x + y + n + m;
		double totalMulti = x * y * n * m;
		System.out.println("Suma de "+ n + " + " + m + " = " + suma3);
		System.out.println("División de "+ n + " / " + m + " = " + div3);
		System.out.println("Módulo de "+ n + " % " + m + " = " + resto3);
		System.out.println("Doble de " + x + " = " + x*2);
		System.out.println("Doble de " + y + " = " + y*2);
		System.out.println("Doble de " + n + " = " + n*2);
		System.out.println("Doble de " + m + " = " + m*2);
		System.out.println("Suma de todas las variables: "+ totalSuma);
		System.out.println("Multiplicación de todas las variables: "+ totalMulti);
	}

}
