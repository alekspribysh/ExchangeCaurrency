package com.currencyAPI;


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
public class Currency {

    @Path("{/d}")
    @GET
    @Produces("application/json")
    public Response converter(@PathParam("d") int d) {
        double doll = d;
        double eur;

        eur = d * 0.8;
        JSONObject js = new JSONObject();
        {

            js.put("euro", eur);
            js.put("dollars", d);

            return Response.status(200).entity(js.toString()).build();
        }
    }

}









