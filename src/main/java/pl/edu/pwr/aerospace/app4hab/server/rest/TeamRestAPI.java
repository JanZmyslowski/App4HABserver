package pl.edu.pwr.aerospace.app4hab.server.rest;

import org.apache.log4j.Logger;
import pl.edu.pwr.aerospace.app4hab.server.rest.entities.PhoneActivity;
import pl.edu.pwr.aerospace.app4hab.server.rest.entities.Commands;
import pl.edu.pwr.aerospace.app4hab.server.rest.entities.Image;
import pl.edu.pwr.aerospace.app4hab.server.rest.entities.SensorStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/control")
public class TeamRestAPI {
    private static final Logger LOG = Logger.getLogger(TeamRestAPI.class);

    @POST
    @Path("/commands")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCommands(Commands c) {
        LOG.info("Incoming request for updating commands");


        return Response.status(200).build();
    }

    @GET
    @Path("/lastactivity")
    @Produces(MediaType.APPLICATION_JSON)
    public PhoneActivity getLastActivity() {
        LOG.info("Incoming request for last activity");

        PhoneActivity res = new PhoneActivity("", "");

        return res;
    }

    @GET
    @Path("/allactivities")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PhoneActivity> getAllActivities() {
        LOG.info("Incoming request for all activities");

        return new ArrayList<>();
    }

    @GET
    @Path("/statuses")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SensorStatus> getAllStatuses() {
        LOG.info("Incoming request for all statuses");

        return new ArrayList<>();
    }

    @GET
    @Path("/status/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SensorStatus getStatus(@PathParam("id") int id) {
        LOG.info("Incoming request for status with id " + id);

        return new SensorStatus();
    }

    @GET
    @Path("/photos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Image> getAllPhotos() {
        LOG.info("Incoming request for all photos");

        return new ArrayList<>();
    }

    @GET
    @Path("/photo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Image getPhoto(@PathParam("id") int id) {
        LOG.info("Incoming request for Photo with id " + id);

        return new Image();
    }
}
