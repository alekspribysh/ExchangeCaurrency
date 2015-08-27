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

    Client client = Client.create();
    WebResource webResource;
    ClientResponse response;
    //String output;

    @Test
    public void dolltoeur (){


            webResource = client.resource("http://api.fixer.io/latest?base=USD");
            response = webResource.accept("application/json").get(ClientResponse.class);
            String output = response.getEntity(String.class);
            JSONObject object = new JSONObject(output);
            object = (JSONObject) object.get("rates");
            double d = Math.round( object.getDouble("EUR") * 100.0) / 100.0;
            System.out.println(d +0);





       // return object;
    }
}













