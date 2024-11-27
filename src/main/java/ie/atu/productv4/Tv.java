package ie.atu.productv4;

public class Tv extends Product {
    private String manufacture;

    private String screenSize;

    public Tv() {
        super();
        manufacture = "";
        screenSize = "";
        count++;
    }


    public void setScreenSize(String screenSize) {this.screenSize = screenSize;}

    public String getScreenSize() {return screenSize ;}


    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {return super.toString() + " by " + manufacture + "\n" + "Screen size is " + screenSize;}
}
