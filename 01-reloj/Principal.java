package Reloj;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Hora h1 = new Hora(11, 30);
        System.out.println(h1);
        for (int i = 0; i <= 40; i++) {
            h1.inc();
        }
        System.out.println(h1);
        
        for (int i = 0; i < 300; i++) {
            h1.inc();
            Thread.sleep(1000);
            System.out.println(h1);
        }
    }
}
