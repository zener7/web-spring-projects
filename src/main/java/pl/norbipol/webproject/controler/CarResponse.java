package pl.norbipol.webproject.controler;

public class CarResponse {
    private String name;
    private boolean started;

    public CarResponse(String name, boolean started) {
        this.name = name;
        this.started = started;
    }

    public String getName() {
        return name;
    }

    public boolean isStarted() {
        return started;
    }
}
