package Car;

public class AsianSoundBundle implements SoundBundleFactory {
    @Override
    public Receiver makeReceiver() {
        return new Samsung();
    }
}
