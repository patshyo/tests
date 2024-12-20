public class DishWasher implements WasteImpact{
    private int waterPressure;
    private String brand;

    public DishWasher(int waterPressure, String brand ) {
        this.waterPressure = waterPressure;
        this.brand = brand;
    }
    @Override
    public double calculateWasteImpact(){
        return waterPressure * 30;
    }
    @Override
    public String toString(){
        return String.format("Water Pressure:%d%nBrand:%s%n",waterPressure,brand);
    }
}
