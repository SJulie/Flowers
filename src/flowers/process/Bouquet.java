package flowers.process;

import flowers.bean.ifaces.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;
    private double totalCost;

    public Bouquet() {
        flowers = new ArrayList<>();
        totalCost = 0;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
        totalCost = totalCost + flower.getPrice();
    }

    public void addFlowers(List<Flower> flowers) {
        for (Flower flower: flowers){
            addFlower(flower);
        }
    }

    public List<Flower> getFlowers(){
        return flowers;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String toString() {
        return "Total cost: " + totalCost + " \nList of flowers: " + flowers.toString();
    }
}
