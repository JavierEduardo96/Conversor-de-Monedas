import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Moneda {
	private BigDecimal cantidad=new BigDecimal(10);
	private String divisa="USD";
	private BigDecimal valueUsd= new BigDecimal(1.00);
	
	Moneda(){
		this.valueUsd=new BigDecimal(1.00);
		this.divisa="USD";
		this.cantidad=new BigDecimal(0);
	}
	
	Moneda(BigDecimal cantidad, String divisa){
		this.cantidad=cantidad;
		this.divisa=divisa;
		for (Divisas test : Divisas.values()) {
			if (divisa == test.name()) {
				this.valueUsd=test.getUsdValue();
			}
		}
		
	}
	
	public Moneda Convertir(String divisaNueva) {
		Moneda nuevaMoneda = new Moneda();
		BigDecimal nuevaCantidad;
		for (Divisas test : Divisas.values()) {
			if (divisaNueva == test.name()) {
				nuevaMoneda.setDivisa(test.name());
				nuevaMoneda.setValueUsd(test.getUsdValue());
//				nuevaCantidad=Math.round(100*this.getCantidad()*(BigDecimal.divide(test.getUsdValue(),this.getValueUsd())));
				nuevaCantidad=test.getUsdValue().divide(this.getValueUsd(), 10, RoundingMode.HALF_EVEN);
				nuevaCantidad=nuevaCantidad.multiply(this.getCantidad()).setScale(2, RoundingMode.HALF_EVEN);
				nuevaMoneda.setCantidad(nuevaCantidad);
				return nuevaMoneda;
				//System.out.println(nuevaMoneda.getCantidad());
			}
			
		}
		
		return null;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public BigDecimal getValueUsd() {
		return valueUsd;
	}

	public void setValueUsd(BigDecimal valueUsd) {
		this.valueUsd = valueUsd;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
}
