package web.model;

public class Car {
    private String model;
    private int old;
    private int price;


    public Car(String model, int old, int price) {
        this.model = model;
        this.old = old;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
