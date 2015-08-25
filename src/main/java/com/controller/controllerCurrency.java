package com.controller;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by alekspribysh on 8/24/15.
 */
@Path("/controller")
public class controllerCurrency {
    @Path("{f}")
    @GET
    @Produces("application/json")
    public Response converter(@PathParam("f") double f){
        double far = f;
        double cel;

        cel = (far - 32) * 5/9;
        JSONObject js = new JSONObject(); {


            js.put("faren", far);
            js.put("cels", cel);

            return Response.status(200).entity(js.toString()).build();
        }
    }

}
