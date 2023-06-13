import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ApiConnection {
 
	public void refreshRates() throws IOException, InterruptedException, URISyntaxException {
		
	
	CurrencyRate cr = new CurrencyRate();
	
	String GET_URL ="https://api.apilayer.com/fixer/latest?symbols=USD,EUR,GBP,JPY,KRW,MXN&base=USD";
	String APIKey=Constants.APIKey;

	
	HttpRequest getRequest = HttpRequest.newBuilder()
			.uri(new URI(GET_URL))
			.header("apikey", APIKey)
			.GET()
			.build();
	
	HttpClient httpClient = HttpClient.newHttpClient();
	
	HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
	
	Gson gson = new Gson();
	System.out.println(getResponse.body());
	cr = gson.fromJson(getResponse.body(),CurrencyRate.class);
	
	Divisas.EUR.setUsdValue(cr.getRates().getEUR());
	Divisas.GBP.setUsdValue(cr.getRates().getGBP());
	Divisas.JPY.setUsdValue(cr.getRates().getJPY());
	Divisas.KRW.setUsdValue(cr.getRates().getKRW());
	Divisas.MXN.setUsdValue(cr.getRates().getMXN());
	
	System.out.println("Rates actualizados");
	}
}
