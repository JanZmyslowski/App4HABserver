//package pl.edu.pwr.aerospace.weather.RESTService;
//
//import java.io.File;
//
//import javax.ws.rs.Path;
//
//import org.apache.log4j.Logger;
//
//import com.sun.jersey.spi.resource.Singleton;
//
//import pl.edu.pwr.aerospace.wunderground.client.WundergroundClient;
//
//@Path("")
//@Singleton
//public class ResourcesJersey {
//	static final Logger LOG = Logger.getLogger(ResourcesJersey.class);
//
//	private static WeatherService ws;
//
//	public ResourcesJersey() {
//		LOG.info("=== Initializing resources holder ===");
//		WundergroundClient client = new WundergroundClient("http://api.wunderground.com");
//		// ("http://localhost:8089");
//		String citiesJson = "src/main/resources/supportedCities.json";
//		CitiesProvider citiesProvider = new FileCitiesProvider(new File(citiesJson));
//		WundergroundTransformer transformer = new WundergroundTransformer();
//
//		ws = new WeatherServiceNoCache(client, transformer, citiesProvider);
//
//		FrontService.setWeatherService(ws);
//		PhoneRestAPI.setWeatherService(ws);
//
//		LOG.info("=== Finished initializing resources holder ===");
//	}
//}
