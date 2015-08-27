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


    Client client = Client.create();
    WebResource webResource;
    ClientResponse response;
    String output;
    JSONObject obj;
    double rates;
    double result;




    @Test
    private double getRatesEur (String url){

        webResource = client.resource(url);
        response = webResource.accept("application/json").get(ClientResponse.class);
        output = response.getEntity(String.class);
        //System.out.println(output);
        obj = new JSONObject(output).getJSONObject("rates");
        rates = Math.round( obj.getDouble("EUR") * 100.0) / 100.0;
      //  System.out.println(rates + 2);

        return rates;
    }

    public double calculateEur (double cur,String url ){

         result = cur * getRatesEur(url);
         return result;
    }

      @Test
       private double getRatesDoll (String url){


          webResource = client.resource(url);
          response = webResource.accept("application/json").get(ClientResponse.class);
          output = response.getEntity(String.class);
         // System.out.println(output);
          obj = new JSONObject(output).getJSONObject("rates");
          rates = Math.round( obj.getDouble("USD") * 100.0) / 100.0;
         // System.out.println(rates);


        return rates;
    }

    public double calculateDol (double cur,String url ){

        result = cur * getRatesDoll(url);
        return result;
    }
}













