/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloREST;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author sony
 */
@Path("msg")
public class Message {
    
    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "Hello How are you?";
    }

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    public String putMessage(String content) {
        return "Hello "+ content;
    }
}
