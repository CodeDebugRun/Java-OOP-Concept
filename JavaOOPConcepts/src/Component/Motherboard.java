package Component;

public class Motherboard {

    private String model;
    private double ram;
    private double harddisk;

    public Motherboard(String model, double ram, double harddisk) {
        this.model = model;
        this.ram = ram;
        this.harddisk = harddisk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(double harddisk) {
        this.harddisk = harddisk;
    }
}
