/**
 * SmartTv
 */
public class SmartTv {
    boolean power = false;
    int channel = 1;
    int volume = 25;  
    
    
    public void powerOn() {
        this.power = true;
    }

    public void powerOff() {
        this.power = false;
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public void goToChannel(int channel) {
        this.channel = channel;
    }


}