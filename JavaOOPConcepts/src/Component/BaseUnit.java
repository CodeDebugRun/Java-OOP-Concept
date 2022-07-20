package Component;

public class BaseUnit {

    private String model;
    private String productor;
    private int price;

    public BaseUnit(String model, String productor, int price) {
        this.model = model;
        this.productor = productor;
        this.price = price;
    }

    public void openComputer (){
        System.out.println("Computer is opened");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
