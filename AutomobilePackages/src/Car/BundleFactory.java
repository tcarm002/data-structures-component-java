package Car;

public interface BundleFactory {
    public Roof makeRoof();
    public FuelType makeFuelType();
    public Navigation makeNavigation();
    public Receiver makeReceiver();
    public Seats makeSeats();
    public Tires makeTires();
    
}
