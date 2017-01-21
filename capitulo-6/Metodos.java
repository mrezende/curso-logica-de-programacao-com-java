import java.util.Random;
import java.util.Arrays;
class Metodos {
	
	public static void main(String[] args) {


		int a = 10;
		int b = 5;

		// 0, se a == b
		// -1, se a < b
		// 1, se a > b
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int resultado = compara(a, b);
		System.out.println("Resultado: " + resultado);

		String nome = "Ana";
		String nome2 = "José";

		System.out.println("nome = " + nome);
		System.out.println("nome2 = " + nome2);
		resultado = compara(nome, nome2);
		System.out.println("Resultado: " + resultado);

		resultado = soma();

		System.out.println("soma () = " + resultado);


		resultado = soma(10, 5, 6, 7);

		System.out.println("soma (10, 5, 6, 7) = " + resultado);

	}

	static int soma(int... y) {
		int resultado = 0;
		for(int i = 0; i < y.length; i++) {
			resultado += y[i];
		}
		return resultado;
	}

	static int compara(String p1, String p2) {
		if(p1.length() == p2.length()) {
			return 0;
		} else if(p1.length() < p2.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	static int compara(int x, int y) {
		if(x == y) {
			return 0;
		} else if(x < y) {
			return -1;
		} else {
			return 1;
		}
	}

	static void trocaValor(double a) {
		a = 3.4;
	}

	static void imprimeSaudacao() {
		System.out.println("Olá");
	}

	static void inverteArray(int[] numeros) {

		int e = 0;
		int d = numeros.length - 1;

		while(e < d) {
			trocaPosicao(numeros, e, d);
			e++;
			d--;
		}

	}

	static int encontraMenorElemento(int[] array, int inicio, int fim) {

		int indiceMenor = inicio;

		for (int i = inicio + 1; i <= fim ; i++ ) {
			if (array[i] < array[indiceMenor]) {
				indiceMenor = i;
			}
		}

		return indiceMenor;

	}

	static void trocaPosicao(int[] numeros, int pos1, int pos2) {
		// numeros[pos1]
		// numeros[pos2]

		int aux;
		aux = numeros[pos1];
		numeros[pos1] = numeros[pos2];
		numeros[pos2] = aux;
	}

	static int[] geraArray(int n) {
		int[] numeros = new int[n];

		Random gerador = new Random();

		for (int i = 0; i < n ; i++) {
			int numero = gerador.nextInt(20) + 1; // [1, 21[
			numeros[i] = numero;
		}
		return numeros;

	}

	static void exibeArray(int[] numeros) {

		String texto = "[";

		for(int i = 0; i < numeros.length - 1; i++) {
			texto += numeros[i] + ", ";
		}
		if(numeros.length != 0) {
			texto += numeros[numeros.length - 1] + "]";
		} else {
			texto += "]";
		}

		System.out.println(texto);

	}


	// Múltiplo de 400, é bissexto
	// Cc. se ele for múltiplo de 100, não é
	// CC, se ele for múltiplo de 4, ele é bissexto
	// CC, não é bissexto
	static boolean ehBissexto(int ano) {
		if(ano % 400 == 0) {
			return true;
		}
		if(ano % 100 == 0) {
			return false;
		}
		if(ano % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}

	static void calculaBaskara(double a, double b, double c) {

		double delta = b*b - 4*a*c;

		if(delta < 0 || a == 0) {
			System.out.println("Impossível calcular");
		} else {
			double R1 = (-b - Math.sqrt(delta))/ 2 * a;
			double R2 = (-b + Math.sqrt(delta)) / 2* a;
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}

	}

	static double calculaConsumoDeCombustivel(double km, double litros) {
		return km/litros;
	}

	


}