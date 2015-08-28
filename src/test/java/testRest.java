import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;

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

    public void testetd(){
     url = "http://localhost:8080/currency/rest/converter/etd/";
    webResource = client.resource(url);
    response = webResource.accept("application/json").get(ClientResponse.class);
    output = response.getEntity(String.class);

    }
}
