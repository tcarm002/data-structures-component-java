package Car;

public class EuropeanLuxuryBundle implements LuxuryBundleFactory{

    @Override
    public Roof makeRoof() {
        return new Sunroof();
    }

    @Override
    public Navigation makeNavigation() {
        return new EuropeNav();
    }

    @Override
    public Seats makeSeats() {
        return new Cloth();
    }
    
}