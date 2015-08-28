package com.controller;

import com.currencyAPI.Currency;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by alekspribysh on 8/24/15.
 */
@Path("/converter")
public class controllerCurrency {

    private Currency cur = new Currency();
    private JSONObject js = new JSONObject();
    private String url;

    @Path("dte/{d}")
    @GET
    @Produces("application/json")
    public Response dte(@PathParam("d") double d) {
        url = "http://api.fixer.io/latest?base=USD";

        {
            js.put("result", cur.calculateEur(d, url));

            return Response.status(200).entity(js.toString()).build();
        }
    }

    @Path("etd/{d}")
    @GET
    @Produces("application/json")
    public Response etd (@PathParam("d") double d) {
        url = "http://api.fixer.io/latest";

        {
            js.put("result", cur.calculateEur(d, url));

            return Response.status(200).entity(js.toString()).build();
        }
    }


}

