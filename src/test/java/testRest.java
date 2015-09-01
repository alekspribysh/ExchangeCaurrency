import com.currencyAPI.Currency;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.testng.annotations.Test;

/**
 * Created by alekspribysh on 8/27/15.
 */
public class testRest {

    private Client client = Client.create();
    private WebResource webResource;
    private ClientResponse response;
    private String output;
    private JSONObject obj;
    private String url;

    Currency cur = new Currency();

    @Test
    public void testetd(){
     url = "http://localhost:8080/currency/rest/converter/etd/";
     cur.calculateEur(10,url);


    }
}
