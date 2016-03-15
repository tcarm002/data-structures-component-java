package Car;

public class LuxuryBundle extends Automobile {
    LuxuryBundleFactory luxuryBundleFactory;
            
    public LuxuryBundle(LuxuryBundleFactory luxuryBundleFactory){
        this.luxuryBundleFactory = luxuryBundleFactory;
    }

    @Override
    void manufacture() {
        System.out.println("Adding a luxury bundleto your new " + model);
        roof = luxuryBundleFactory.makeRoof();
        seats = luxuryBundleFactory.makeSeats();
        navigation = luxuryBundleFactory.makeNavigation();
    }
}
