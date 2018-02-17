package pl.edu.pwr.aerospace.app4hab.server.rest;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import pl.edu.pwr.aerospace.app4hab.server.entities.Commands;
import pl.edu.pwr.aerospace.app4hab.server.entities.SensorStatus;

@Path("/api")
// @Singleton
public class PhoneRestAPI {
    private static final Logger LOG = Logger.getLogger(PhoneRestAPI.class);

    public PhoneRestAPI() {
        LOG.info("Initializing PhoneRestAPI");
    }

    @GET
    @Path("/commands")
    @Produces(MediaType.APPLICATION_JSON)
    public Commands getLatestCommands() {
        LOG.info("Incoming request for latest commands");

        Commands c = new Commands();

        return c;
    }

    @POST
    @Path("/status")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response uploadStatus(SensorStatus status) {
        LOG.info("Incoming request with status");


        return Response.status(200).build();
    }

    @POST
    @Path("/photo")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response uploadPhoto(SensorStatus status) {
        LOG.info("Incoming request with photo");


        return Response.status(200).build();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_HTML)
    public String test() {
        LOG.info("Incoming test request");
        return "Server runs";
    }
}
