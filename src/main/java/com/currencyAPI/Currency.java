package com.currencyAPI;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by alekspribysh on 8/24/15.
 */

public class Currency {


    public double dte(double d) {
        double doll = d;
        double eur;
        eur = d * 0.8;
        return eur;
    }

    private Client client = Client.create();
    private WebResource webResource;
    private ClientResponse response;
    private String output;
    private JSONObject obj;
    private double rates;
    private double result;

  //  @Test
    private double getRatesEur (){

        webResource = client.resource("http://api.fixer.io/latest?base=USD");
        response = webResource.accept("application/json").get(ClientResponse.class);
        output = response.getEntity(String.class);
        obj = new JSONObject(output).getJSONObject("rates");
        rates = Math.round( obj.getDouble("EUR") * 100.0) / 100.0;
        System.out.println(rates + 0);

        return rates;
    }

    public double calculateEur (double cur){

         result = cur * getRatesEur();
         return result;
    }
}













