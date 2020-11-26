class contas {
	public static int Divisão(int numero1, int numero2) {
		return (numero1 / numero2);
	}
	public static int Multiplicação(int numero1, int numero2) {
		return (numero1 * numero2);
	}
}


public class MultDiv {

	public static void main(String[] args) {
		int numero1 = 100, numero2 = 50;
		
			System.out.println(contas.Divisão(numero1, numero2));
			System.out.println(contas.Multiplicação(numero1, numero2));
	}

}