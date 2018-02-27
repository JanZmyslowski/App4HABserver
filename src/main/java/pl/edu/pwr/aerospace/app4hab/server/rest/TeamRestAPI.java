package pl.edu.pwr.aerospace.app4hab.server.rest;

import org.apache.log4j.Logger;
import pl.edu.pwr.aerospace.app4hab.server.daos.CommandsDao;
import pl.edu.pwr.aerospace.app4hab.server.daos.ImageDao;
import pl.edu.pwr.aerospace.app4hab.server.daos.PhoneActivityDao;
import pl.edu.pwr.aerospace.app4hab.server.daos.SensorStatusDao;
import pl.edu.pwr.aerospace.app4hab.server.entities.PhoneActivity;
import pl.edu.pwr.aerospace.app4hab.server.entities.Commands;
import pl.edu.pwr.aerospace.app4hab.server.entities.Image;
import pl.edu.pwr.aerospace.app4hab.server.entities.SensorStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("api/control")
public class TeamRestAPI {
    private static final Logger LOG = Logger.getLogger(TeamRestAPI.class);

    public TeamRestAPI() {
        LOG.info("Initializing TeamRestAPI");
    }

    @POST
    @Path("/commands")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCommands(Commands c) {
        LOG.info("Incoming request for updating commands");

        CommandsDao dao = new CommandsDao();
        dao.save(c);

        return Response.status(200).build();
    }

    @GET
    @Path("/lastactivity")
    @Produces(MediaType.APPLICATION_JSON)
    public PhoneActivity getLastActivity() {
        LOG.info("Incoming request for last activity");

        PhoneActivityDao dao = new PhoneActivityDao();
        return dao.getLastActivity();
    }

    @GET
    @Path("/allactivities")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PhoneActivity> getAllActivities() {
        LOG.info("Incoming request for all activities");

        PhoneActivityDao dao = new PhoneActivityDao();
        return dao.getAllActivities();
    }

    @GET
    @Path("/activity/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PhoneActivity getActivity(@PathParam("id") int id) {
        LOG.info("Incoming request for activity with id " + id);

        PhoneActivityDao dao = new PhoneActivityDao();
        return dao.getActivity(id);
    }

    @GET
    @Path("/statuses")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SensorStatus> getAllStatuses() {
        LOG.info("Incoming request for all statuses");

        SensorStatusDao dao = new SensorStatusDao();
        return dao.getAllStatuses();
    }

    @GET
    @Path("/status/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SensorStatus getStatus(@PathParam("id") int id) {
        LOG.info("Incoming request for status with id " + id);

        SensorStatusDao dao = new SensorStatusDao();
        return dao.getStatus(id);
    }

    @GET
    @Path("/photos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Image> getAllPhotos() {
        LOG.info("Incoming request for all photos");

        ImageDao dao = new ImageDao();
        return dao.getAllImages();
    }

    @GET
    @Path("/photo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Image getPhoto(@PathParam("id") int id) {
        LOG.info("Incoming request for Photo with id " + id);

        ImageDao dao = new ImageDao();
        return dao.getImage(id);
    }

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public String def() {
        LOG.info("Incoming default request");
        return "Default";
    }
}
