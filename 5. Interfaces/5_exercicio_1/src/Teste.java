
public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel c = new Circulo(15.0);
		System.out.println(c.calculaArea());
	}

}
