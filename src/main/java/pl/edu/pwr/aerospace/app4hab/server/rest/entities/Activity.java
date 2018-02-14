package pl.edu.pwr.aerospace.app4hab.server.rest.entities;

import java.util.Date;

public class Activity {
    private Date timestamp;
    private String endpoint;
    private String payload;

    public Activity(String endpoint, String payload) {
        timestamp = new Date();
        this.endpoint = endpoint;
        this.payload = payload;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
