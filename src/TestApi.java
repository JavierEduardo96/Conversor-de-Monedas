import java.io.IOException;
import java.net.URISyntaxException;

import com.google.gson.Gson;

public class TestApi {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		CurrencyRate cr = new CurrencyRate();
		
		Gson gson = new Gson();
		
		String response="{\r\n"
				+ "  \"base\": \"USD\",\r\n"
				+ "  \"date\": \"2022-04-14\",\r\n"
				+ "  \"rates\": {\r\n"
				+ "    \"EUR\": 0.813399,\r\n"
				+ "    \"GBP\": 0.72007,\r\n"
				+ "    \"JPY\": 107.346001\r\n"
				+ "  },\r\n"
				+ "  \"success\": true,\r\n"
				+ "  \"timestamp\": 1519296206\r\n"
				+ "}";
		
		cr = gson.fromJson(response,CurrencyRate.class);
		
		System.out.println("Euro " + cr.getRates().getEUR());
		System.out.println("GBP " + cr.getRates().getGBP());
		System.out.println("JPY " + cr.getRates().getJPY());
	}
}
