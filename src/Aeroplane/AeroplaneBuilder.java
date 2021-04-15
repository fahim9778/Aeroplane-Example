package Aeroplane;

// Class declaration
public class AeroplaneBuilder {

    // accessors / mutators (public and protected)
    protected String type = "Basic";
    public String name = "Simple Aeroplane";
    protected AeroplaneEngine engine = new AeroplaneEngine();
    protected int seats = 50;

    private void checkEngine() {
        if (this.engine == null)
        {
            System.out.println("No Plane can run without Engine. Exiting....");
            System.exit(0);        }
    }

    public AeroplaneBuilder(){}

    public AeroplaneBuilder(String type, String name, int seats) {
        this.type = type;
        this.name = name;
        this.seats = seats;
        checkEngine();
    }

    public int getSeatsNumber() {
        return seats;
    }
    public void setSeatsNumber(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setEngineAndSpeed(String engineName, double engineSpeed) {
        // ERROR: speed has private access in Aeroplane.AeroplaneEngine
        /* engine.speed = 50;  //won't work*/

        engine.setEngineName(engineName);
        engine.setSpeed(engineSpeed);
        checkEngine();
    }

    // Object as Return type and Parameter
    public AeroplaneBuilder buildAeroplaneWithSpecifications(String type, String name, AeroplaneEngine engine, int seats){
        this.type = type;
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        checkEngine();

        return new AeroplaneBuilder();
    }

    // Method overloading (3 parameters)
    public void upgradeAeroplane (String newName, String newType, AeroplaneEngine newEngine)
    {
        this.name = newName;
        this.type = newType;
        this.engine = newEngine;
        checkEngine();
    }

    // Method overloading (2 parameters)
    public void upgradeAeroplane (String newType, AeroplaneEngine newEngine)
    {
        this.type = newType;
        this.engine = newEngine;
        checkEngine();
    }

    public void getAeroplaneDetails(){
        System.out.println("This is a " + this.name + " , which is a type of " + this.type +
                " plane . \nThis aeroplane can carry upto " + this.seats + " passenger(s). " +
                "With its great " + this.engine.getEngineName() + " engine, it can travel at speed of " + this.engine.getSpeed()
                + " km/h.");
    }

}
