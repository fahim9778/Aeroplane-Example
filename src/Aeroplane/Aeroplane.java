package Aeroplane;

public class Aeroplane {
    public static void main(String[] args) {
        /* Remove comment of getAeroplaneDetails function one-by-one to see the effect of Encapsulation,
        Aggregation etc.*/

        AeroplaneBuilder simpleAeroplane = new AeroplaneBuilder(); // default object instantiation
        //simpleAeroplane.getAeroplaneDetails(); // Basic details

        simpleAeroplane.setSeatsNumber(90); //setting the seat number
        simpleAeroplane.setEngineAndSpeed("Jet", 852.0); // setting engine type and speed via Builder class through Engine class

        /* modifying from scratch */
        simpleAeroplane.buildAeroplaneWithSpecifications("Fighter", "F61", simpleAeroplane.engine, 1);
        //simpleAeroplane.getAeroplaneDetails();

        simpleAeroplane.setSeatsNumber(65);
        /* only upgrading a few parts using method overloading */
        simpleAeroplane.upgradeAeroplane("Bowing-777","Passenger", simpleAeroplane.engine);
        //simpleAeroplane.getAeroplaneDetails();

        //Composition example: HAS-A relation, strong aggregation. Aeroplane can't fly without engine.
        // Remove next two comments to the see composition effect.
        // simpleAeroplane.upgradeAeroplane(null, null);
        // simpleAeroplane.getAeroplaneDetails();

        //Association example: IS-A relation, weak aggregation. SimpleAeroplane, Jet plane is a type of Aeroplane builder.
        AeroplaneBuilder jetPlane = new AeroplaneBuilder();
        jetPlane.setEngineAndSpeed("Jet", 5000.0);
        jetPlane.setSeatsNumber(2);
        jetPlane.getAeroplaneDetails();

        /* Jetplane and SimpleAeroplnae are example of Encapsulation. Each object's data are confined only to
            the particular object. None have effect on another.
         */
    }
}

