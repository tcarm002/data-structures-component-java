package Car;

public class EuropeanPerformanceBundle implements PerformanceBundleFactory {

    @Override
    public FuelType makeFuelType() {
        return new Petrol();
    }

    @Override
    public Tires makeTires() {
        return new Sixteen();
    }
    
}
