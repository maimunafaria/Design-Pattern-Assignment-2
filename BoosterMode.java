public class BoosterMode extends PrintMode{
    public double intensityThreshold;

    public BoosterMode(double intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }

    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {

    }
    @Override
    public void boost() {
        setColorIntensity(intensityThreshold);
    }
}
