package Component;

public class Computer {

    private String brand;
    private String name;
    private BaseUnit baseUnit;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String brand, String name, BaseUnit baseUnit, Monitor monitor, Motherboard motherboard) {
        this.brand = brand;
        this.name = name;
        this.baseUnit = baseUnit;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseUnit getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(BaseUnit baseUnit) {
        this.baseUnit = baseUnit;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
