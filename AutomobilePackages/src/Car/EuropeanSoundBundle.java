package Car;

public class EuropeanSoundBundle implements SoundBundleFactory {
    
    public Receiver makeReceiver(){
        return new Phillips();
    }
}
