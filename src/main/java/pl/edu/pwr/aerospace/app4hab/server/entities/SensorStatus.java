package pl.edu.pwr.aerospace.app4hab.server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SensorStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
