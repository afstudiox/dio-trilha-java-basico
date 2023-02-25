public class Usuario {
    public static void main(String[] args) throws Exception {


        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal :" + smartTv.canal);
        System.out.println("Volume :" + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(5);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal :" + smartTv.canal);
        System.out.println("Volume :" + smartTv.volume);


    }
}
