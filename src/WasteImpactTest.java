import java.util.ArrayList;

public class WasteImpactTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(256,"red", 8,4000);
        WashingMachine washingMachine = new WashingMachine(8,2000);
        DishWasher dishWasher = new DishWasher(300, "Samsung");

        ArrayList<WasteImpact> wasteProducts = new ArrayList<WasteImpact>();
        wasteProducts.add(smartPhone);
        wasteProducts.add(washingMachine);
        wasteProducts.add(dishWasher);

        for(WasteImpact currentProduct : wasteProducts){
            System.out.print(currentProduct.toString());
            System.out.printf("Waste Impact:%f%n",currentProduct.calculateWasteImpact());

        }
    }
}
