import java.math.BigDecimal;

public enum Divisas {
	//Conversion a 06 de Marzo del 2023
	USD(new BigDecimal(1)),
	EUR(new BigDecimal(0.95)),
	GBP(new BigDecimal(0.83)),
	JPY(new BigDecimal(137.00)),
	KRW(new BigDecimal(1298.58)),
	MXN(new BigDecimal(17.99));
	
	private BigDecimal usdValue;
	
	Divisas (BigDecimal usdValue){
		this.usdValue=usdValue;
	}

	public BigDecimal getUsdValue() {
		return usdValue;
	}

	public void setUsdValue(BigDecimal usdValue) {
		this.usdValue = usdValue;
	}
	
	
	
}
