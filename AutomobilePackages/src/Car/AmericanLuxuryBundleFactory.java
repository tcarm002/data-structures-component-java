package Car;

public class AmericanLuxuryBundleFactory implements LuxuryBundleFactory{

    @Override
    public Roof makeRoof() {
        return new Sunroof();
    }

    @Override
    public Navigation makeNavigation() {
        return new AmericanNav();
    }

    @Override
    public Seats makeSeats() {
        return new Leather();
    }
    
}
