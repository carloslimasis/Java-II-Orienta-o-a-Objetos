
public class TesteDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try {
			cp.deposita(-100);
		} catch(ValorInvalidoException e) {
			System.out.println("Deposito invalido!");
			System.out.println("Causa: " + e.getMessage());
		}
	}

}
