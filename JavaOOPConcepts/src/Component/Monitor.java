package Component;

public class Monitor {

    private int size = 0;
    private int price = 10_000;
    private String brand = "default brand";
    private String countryBuilt = "Country Built";
    private Resolution resolution; //Resolution classindan bir object olusturduk

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Monitor(int size, int price, String brand, String countryBuilt, Resolution resolution) {
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.countryBuilt = countryBuilt;
        this.resolution = resolution;
    }

    public Monitor(int size, int price, String brand, String countryBuilt) {
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.countryBuilt = countryBuilt;
    }



    /*@Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", countryBuilt='" + countryBuilt + '\'' +
                '}';
    }*/

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountryBuilt() {
        return countryBuilt;
    }

    public void setCountryBuilt(String countryBuilt) {
        this.countryBuilt = countryBuilt;
    }

}

