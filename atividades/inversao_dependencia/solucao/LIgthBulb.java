public interface LightBulb {
    void turnOn();
    void turnOff();
}

public class StandardLightBulb implements LightBulb {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}