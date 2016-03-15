package Car;

public class AmericanSoundBundle implements SoundBundleFactory {
    
    public Receiver makeReceiver(){
        return new Kenwood();
    }
}
