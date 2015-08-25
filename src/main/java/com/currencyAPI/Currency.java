package com.currencyAPI;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.testng.annotations.Test;

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
//    Client client = Client.create();
//    JSONObject object = new JSONObject();
//
//    @Test
//    public void dolltoeur(){
//
//    WebResource webResource = client.resource("http://api.fixer.io/latest");
//
//    ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
//    String output = response.getEntity(String.class);
//
//        System.out.println(output);
//    }
//
//    public void  dollarstoeur (){
//
//
//    }

@Path("ETD/{d}")
@GET
@Produces("application/json")
public Response converter(@PathParam("d") double d){
  public class FCelcium {
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






}
