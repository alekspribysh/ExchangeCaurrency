package com.currencyAPI;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


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
    //private String url;



    private JSONObject getJSRates(String url) {

        webResource = client.resource(url);
        response = webResource.accept("application/json").get(ClientResponse.class);
        output = response.getEntity(String.class);
        obj = new JSONObject(output).getJSONObject("rates");
        return obj;
    }

    public double calculateEur(double cur, String url) {

        result = cur * getRates(url, getJSRates(url) );
        return result;
    }


    public double getRates(String url,JSONObject obj ){

        if (url.contains("USD")) {
            rates = Math.round(obj.getDouble("EUR") * 100.0) / 100.0;
        } else {
            rates = Math.round(obj.getDouble("USD") * 100.0) / 100.0;
        }

        return rates;

    }

}













