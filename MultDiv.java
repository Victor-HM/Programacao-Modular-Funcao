class contas {
	public static int Divis�o(int numero1, int numero2) {
		return (numero1 / numero2);
	}
	public static int Multiplica��o(int numero1, int numero2) {
		return (numero1 * numero2);
	}
}


public class MultDiv {

	public static void main(String[] args) {
		int numero1 = 100, numero2 = 50;
		
			System.out.println(contas.Divis�o(numero1, numero2));
			System.out.println(contas.Multiplica��o(numero1, numero2));
	}

}