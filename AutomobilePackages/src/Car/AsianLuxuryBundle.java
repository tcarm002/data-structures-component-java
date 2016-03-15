package Car;

public class AsianLuxuryBundle implements LuxuryBundleFactory{

    @Override
    public Roof makeRoof() {
        return new StandardRoof();
    }

    @Override
    public Navigation makeNavigation() {
        return new AsianNav();
    }

    @Override
    public Seats makeSeats() {
        return new Leather();
    }
    
}
