import java.math.BigDecimal;

public class Rates {
	private BigDecimal USD= new BigDecimal (1.0);
	private BigDecimal EUR;
	private BigDecimal GBP;
	private BigDecimal JPY;
	private BigDecimal KRW;
	private BigDecimal MXN;
	
	public BigDecimal getUSD() {
		return USD;
	}
	public void setUSD(BigDecimal uSD) {
		USD = uSD;
	}
	public BigDecimal getEUR() {
		return EUR;
	}
	public void setEUR(BigDecimal eUR) {
		EUR = eUR;
	}
	public BigDecimal getGBP() {
		return GBP;
	}
	public void setGBP(BigDecimal gBP) {
		GBP = gBP;
	}
	public BigDecimal getJPY() {
		return JPY;
	}
	public void setJPY(BigDecimal jPY) {
		JPY = jPY;
	}
	public BigDecimal getKRW() {
		return KRW;
	}
	public void setKRW(BigDecimal kRW) {
		KRW = kRW;
	}
	public BigDecimal getMXN() {
		return MXN;
	}
	public void setMXN(BigDecimal mXN) {
		MXN = mXN;
	}
	
	
}
