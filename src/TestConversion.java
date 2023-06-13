import java.math.BigDecimal;

public class TestConversion {
	public static void main(String[] args) {
		Moneda dolar = new Moneda(new BigDecimal(1),"USD");
		Moneda peso = new Moneda();
		Moneda euro = new Moneda();
		Moneda euro2 = new Moneda();
		
		peso=dolar.Convertir("MXN");
		System.out.println(peso.getCantidad()+ " " + peso.getDivisa());
		
		euro=peso.Convertir("EUR");
		System.out.println(euro.getCantidad()+ " " + euro.getDivisa());
		
		euro2=dolar.Convertir("EUR");
		System.out.println(euro2.getCantidad()+ " " + euro2.getDivisa());
	}
}
