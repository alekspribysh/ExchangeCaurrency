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

    Currency doltoeur = new Currency();

    @Path("dte/{d}")
    @GET
    @Produces("application/json")
    public Response converter(@PathParam("d") double d) {

        JSONObject js = new JSONObject();
        {

            js.put("result", doltoeur.calculateEur(d));

            return Response.status(200).entity(js.toString()).build();
        }
    }


}

