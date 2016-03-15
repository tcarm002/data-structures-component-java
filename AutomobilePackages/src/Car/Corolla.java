package Car;

public class Corolla extends Automobile{

    LuxuryBundleFactory luxuryBundle;
    PerformanceBundleFactory performanceBundle;
    SoundBundleFactory soundBundle;
    
    public Corolla(LuxuryBundleFactory luxuryBundle){
        this.luxuryBundle = luxuryBundle;
        roof = luxuryBundle.makeRoof();
        seats = luxuryBundle.makeSeats();
        navigation = luxuryBundle.makeNavigation();
    }
    
    public Corolla(PerformanceBundleFactory performanceBundle){
        this.performanceBundle = performanceBundle;
        tires = performanceBundle.makeTires();
        fuelType = performanceBundle.makeFuelType();
    }
    
      public Corolla(SoundBundleFactory soundBundle){
        this.soundBundle = soundBundle;
        receiver = soundBundle.makeReceiver();
    }
    
    
    @Override
    void manufacture() {
        System.out.println("Manufacturing " + model);
        
    }
    
}
