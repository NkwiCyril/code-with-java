package classes_objects;
public class HeadphoneMain {
    
    public static void main(String[] args) {
        
        Headphone boomplay = new Headphone();

        boomplay.switchOn();
        
        boomplay.volumeUp();
        boomplay.volumeUp();


        boomplay.volumeDown();
        boomplay.volumeDown();

        boomplay.switchOff();
    }

}
