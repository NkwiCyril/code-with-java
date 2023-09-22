package classes_objects;
public class Headphone {

    String color = "black/grey";
    String[] controls = { "power", "volume", "skip", "play/pause" };
    public int volume = 0;
    public boolean onPower = false;

    public void switchOn() {
        onPower = true;
        System.out.println("The bluetooth to wise is ready to pair!");
    }

    public void switchOff() {
        onPower = false;
        System.out.println("Switching off!");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume: " + volume);
    }

}
