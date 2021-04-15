package Aeroplane;

public class AeroplaneEngine {

    // accessors / mutators (private)
    private String engineName = "Simple";
    private double speed = 1000;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
