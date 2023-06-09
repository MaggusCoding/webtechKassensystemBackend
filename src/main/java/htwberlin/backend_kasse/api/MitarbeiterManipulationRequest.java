package htwberlin.backend_kasse.api;

import java.time.Instant;

public class MitarbeiterManipulationRequest {

    private String nachname;

    private String studiengang;
    private Instant timestamp;
    private Instant lastUpdatedOn;
    private String vorname;

    public MitarbeiterManipulationRequest(int id, String vorname, String nachname, String studiengang, Instant timestamp, Instant lastUpdatedOn) {
        this.nachname = nachname;
        this.studiengang = studiengang;
        this.timestamp = timestamp;
        this.lastUpdatedOn = lastUpdatedOn;
        this.vorname = vorname;
    }
public MitarbeiterManipulationRequest() {}
    public String getVorname() {
        return vorname;
    }

    //Getters Setters
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Instant getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Instant lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
}
