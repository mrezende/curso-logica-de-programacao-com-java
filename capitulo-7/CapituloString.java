class CapituloString {
	
	public static void main(String[] args) {
		
		String nome = "Socorram me subi no onibus em Marrocos";

		boolean ehPalindromo = ehPalindromo(nome);


		System.out.println(nome + " é palíndromo? " + ehPalindromo);

	}

	static boolean ehPalindromo(String s) {

		String sSemEspacos = s.replaceAll(" ", "")
									.toUpperCase();

		int e = 0;
		int d = sSemEspacos.length() - 1;

		while(e < d) {
			if(sSemEspacos.charAt(e) == sSemEspacos.charAt(d)) {
				e++;
				d--;
			} else {
				return false;
			}
		}

		return true;

	}


}