package flowers.bean.ifaces;

import java.awt.*;


public abstract class Flower {

    private String name;
    private final Color color = null;
    private double price;

    public Flower(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor(Color color) {
        return color;
    }

    @Override
    public String toString() {
        return name;
    }

}