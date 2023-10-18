public class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void press() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}