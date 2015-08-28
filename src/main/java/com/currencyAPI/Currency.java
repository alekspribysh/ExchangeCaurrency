package com.currencyAPI;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;


/**
 * Created by alekspribysh on 8/24/15.
 */

public class Currency {


    private Client client = Client.create();
    private WebResource webResource;
    private ClientResponse response;
    private String output;
    private JSONObject obj;
    private double rates;
    private double result;



    private double getRatesEur(String url) {

        webResource = client.resource(url);
        response = webResource.accept("application/json").get(ClientResponse.class);
        output = response.getEntity(String.class);
        obj = new JSONObject(output).getJSONObject("rates");
        if (url.contains("USD")) {
            rates = Math.round(obj.getDouble("EUR") * 100.0) / 100.0;
        } else {
            rates = Math.round(obj.getDouble("USD") * 100.0) / 100.0;
        }
        return rates;
    }

    public double calculateEur(double cur, String url) {

        result = cur * getRatesEur(url);
        return result;
    }

}













