package flowers.factory;

import flowers.bean.*;
import flowers.bean.ifaces.Flower;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerFactory {

    public List<Flower> create(String name, int numberFlowers) {
        List<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < numberFlowers; i++) {
            flowers.add(create(name));
        }
        return flowers;
    }

    public Flower create(String name) {
        Flower flower = null;

        switch (name) {
            case "Sunflower":
                flower = new Sunflower();
                break;
            case "Rose":
                flower = new Rose();
                break;
            case "Lily":
                flower = new Lily();
                break;
            case "Daisy":
                flower = new Daisy();
                break;
            case "Chamomile":
                flower = new Chamomile();
                break;
        }
        return flower;
    }
}
