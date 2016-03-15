package Car;

public abstract class Automobile {
    
    String model;
  
    Roof roof;
    FuelType fuelType;
    Navigation navigation;
    Receiver receiver;
    Seats seats;
    Tires tires;    
    
    abstract void manufacture();
    
      
    String getModel(){
        return model;
    }
    
    public String toString(){
        return "fix this" ;
    }
    
}
