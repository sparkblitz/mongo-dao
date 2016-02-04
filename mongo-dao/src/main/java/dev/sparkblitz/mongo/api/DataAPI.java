/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.sparkblitz.mongo.api;

import com.mongodb.MongoClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jguillen <jguillen@gocatapult.com>
 */
@Path("data")
public class DataAPI {
    @GET
    @Path("hello")
    @Produces(value = MediaType.TEXT_HTML)
    public String hello(){
        return "<h1>hello</h1>";
    }

    @GET
    @Path("my-mongo")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String mongoTest(){
        //connect to mongo server
        return System.getenv("OPENSHIFT_MONGODB_DB_URL");
    }

}
