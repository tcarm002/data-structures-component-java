package Car;

public abstract class CarPlant {
    protected abstract Automobile createAuto(String model);
    
    public Automobile makeCar(String bundle){
        Automobile auto = createAuto(bundle);
        auto.manufacture();
        System.out.println("Making  a " + auto.getModel() );
        return auto;
    }
    
}
