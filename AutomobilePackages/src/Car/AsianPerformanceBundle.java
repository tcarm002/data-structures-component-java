package Car;

public class AsianPerformanceBundle implements PerformanceBundleFactory {

    @Override
    public FuelType makeFuelType() {
        return new Nafta();
    }

    @Override
    public Tires makeTires() {
        return new Fifteen();
    }
    
}
