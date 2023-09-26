public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("SmartTv power: " + smartTv.power);
        System.out.println("SmartTv channel: " + smartTv.channel);
        System.out.println("SmartTv volume: " + smartTv.volume);

        smartTv.powerOn();
        smartTv.volumeUp();
        smartTv.channelUp();
        System.out.println("SmartTv power: " + smartTv.power);
        System.out.println("SmartTv volume: " + smartTv.volume);
        System.out.println("SmartTv channel: " + smartTv.channel);
        smartTv.channelDown();
        smartTv.volumeDown();
        System.out.println("SmartTv volume: " + smartTv.volume);
        System.out.println("SmartTv channel: " + smartTv.channel);

        smartTv.goToChannel(10);
        System.out.println("SmartTv channel: " + smartTv.channel);
    }
}
