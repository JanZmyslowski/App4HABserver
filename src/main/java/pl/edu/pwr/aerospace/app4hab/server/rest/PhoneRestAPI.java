package pl.edu.pwr.aerospace.app4hab.server.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import javassist.NotFoundException;
import pl.edu.pwr.aerospace.app4hab.server.rest.responses.Commands;

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


	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_HTML)
	public String test() {
		LOG.info("Incoming test request");
		return "Server runs";
	}
}
