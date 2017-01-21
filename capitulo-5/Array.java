import java.util.Random;
import java.util.Arrays;
class Array {

	public static void main(String[] args) {
		
		int[] numeros = new int[2];

		Random gerador = new Random();

		for(int i = 0; i < numeros.length; i++) {
			// gerando um numero aleatório no intervalo
			// [1, 11[
			int n = gerador.nextInt(10) + 1;
			numeros[i] = n;
				
		}
		
		

		
	}

}