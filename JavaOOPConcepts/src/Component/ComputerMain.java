package Component;

public class ComputerMain {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(4000, 250);//Resolution objesi olustu
        Monitor monitor = new Monitor(25,1000,"Samsung", "Japan",resolution);

        BaseUnit baseUnit = new BaseUnit("IBM", "Dell", 2500);

        Motherboard motherboard = new Motherboard("Asus", 2.4, 200);

        Computer computer = new Computer("Casper", "Nirvana", baseUnit, monitor, motherboard);


        System.out.println(computer.getMonitor());//to string oldugu icin string donuyor
        System.out.println(computer.getBaseUnit());//referans adresini donuyor
        System.out.println(computer.getMotherboard());
        System.out.println(computer.getMonitor());//to string olmazsa adresi donuyor
        System.out.println(computer);
        System.out.println(computer.getMonitor().getBrand());
        System.out.println(monitor.getResolution());
        System.out.println(computer.getMonitor().getResolution());
        computer.getMonitor().getResolution().highResolution();

    }
}
