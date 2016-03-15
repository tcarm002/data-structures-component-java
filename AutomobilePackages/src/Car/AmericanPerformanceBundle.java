package Car;

public class AmericanPerformanceBundle implements PerformanceBundleFactory{

    @Override
    public FuelType makeFuelType() {
        return new Gasoline();
    }

    @Override
    public Tires makeTires() {
        return new Seventeen();
    }
    
}
