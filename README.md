# Aeroplane-Example
A simple Aeroplane example made with Java to demonstrate Basic Java features. 

# Features demonstated
  1. ***Class*** - A blueprint for *Aeroplane*
  2. ***Object*** - Actual instant of such a class
  3. ***Encapsulation*** - the mechanism of data-hiding from one object to another, even if they belong to same class
  4. ***Accessor/Mutator*** - *Privae, Public, Protected* fileds of a class or an object
  5. ***Object as Parameter and Return type*** - Pass object as an function argument and return type
       
       ```java
        // Object as Return type and Parameter
        public AeroplaneBuilder buildAeroplaneWithSpecifications(String type, String name, AeroplaneEngine engine, int seats){
        this.type = type;
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        checkEngine();

        return new AeroplaneBuilder();
      }
      ```
6.***Objects as Aggregator, Association and Compostion***
```java
        //Composition example: HAS-A relation, strong aggregation. Aeroplane can't fly without engine.
        // Remove next two comments to the see composition effect.
        simpleAeroplane.upgradeAeroplane(null, null);
        simpleAeroplane.getAeroplaneDetails(); // Output: "No Plane can run without Engine. Exiting...."

        //Association example: IS-A relation, weak aggregation. SimpleAeroplane, Jet plane is a type of Aeroplane builder.
        AeroplaneBuilder jetPlane = new AeroplaneBuilder();
        jetPlane.setEngineAndSpeed("Jet", 5000.0);
        jetPlane.setSeatsNumber(2);
        jetPlane.getAeroplaneDetails();

        /* Jetplane and SimpleAeroplnae are example of Encapsulation. Each object's data are confined only to
            the particular object. None have effect on another.
         */
    }
```

7. ***Method Overloading*** - creating functions with *similar name and return types*, but *different parameters*
```java
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
```
