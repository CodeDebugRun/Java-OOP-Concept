package Component;

public class Resolution {

    private int pixels = 4000;
    private int ghertz = 12;

    public Resolution(int pixels, int ghertz) {
        this.pixels = pixels;
        this.ghertz = ghertz;
    }
    public void highResolution(){
        System.out.println("Resolution is high");
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public int getGhertz() {
        return ghertz;
    }

    public void setGhertz(int ghertz) {
        this.ghertz = ghertz;
    }
}
