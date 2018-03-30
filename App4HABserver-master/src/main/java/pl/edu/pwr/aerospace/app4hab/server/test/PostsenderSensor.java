package pl.edu.pwr.aerospace.app4hab.server.test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import pl.edu.pwr.aerospace.app4hab.server.entities.SensorStatus;

import java.util.Date;


public class PostsenderSensor {
    static final Logger LOG = Logger.getLogger(PostsenderSensor.class);
    public static void main(String[] args){

        HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead
        ObjectMapper om= new ObjectMapper();

        try {


            SensorStatus sensor = new SensorStatus();

            sensor.setTimestamp(new Date().toString());

            HttpPost request = new HttpPost("http://localhost:8080/app4hab/api/status");
            StringEntity params =new StringEntity(om.writeValueAsString(sensor));
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);


            LOG.info(response.getStatusLine().getStatusCode());

            //handle response here...

        }catch (Exception ex) {

            //handle exception here

        } finally {
            //Deprecated
            //httpClient.getConnectionManager().shutdown();
        }

    }

}

