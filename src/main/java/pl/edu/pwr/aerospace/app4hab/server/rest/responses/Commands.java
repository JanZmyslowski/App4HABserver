package pl.edu.pwr.aerospace.app4hab.server.rest.responses;

public class Commands {
    private boolean logging;
    private boolean camera;
    private boolean radio;
    private boolean sendPicture;

    public boolean isLogging() {
        return logging;
    }

    public void setLogging(boolean logging) {
        this.logging = logging;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isSendPicture() {
        return sendPicture;
    }

    public void setSendPicture(boolean sendPicture) {
        this.sendPicture = sendPicture;
    }


}
