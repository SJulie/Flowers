package flowers;

import flowers.factory.FlowerFactory;
import flowers.process.Bouquet;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Bouquet bouquet = new Bouquet();
        FlowerFactory flowerFactory = new FlowerFactory();

        int countFlowers;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity of Roses");
        countFlowers = sc.nextInt();
        bouquet.addFlowers(flowerFactory.create("Rose", countFlowers));

        System.out.println("Enter quantity of Lilies");
        countFlowers = sc.nextInt();
        bouquet.addFlowers(flowerFactory.create("Lily", countFlowers));

        System.out.println("Enter quantity of Daisies");
        countFlowers = sc.nextInt();
        bouquet.addFlowers(flowerFactory.create("Daisy", countFlowers));

        System.out.println("Enter quantity of Sunflowers");
        countFlowers = sc.nextInt();
        bouquet.addFlowers(flowerFactory.create("Sunflower", countFlowers));

        System.out.println("Enter quantity of Chamomiles");
        countFlowers = sc.nextInt();
        bouquet.addFlowers(flowerFactory.create("Chamomile", countFlowers));

        System.out.println(bouquet);
    }
}