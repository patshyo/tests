public class SmartPhone implements WasteImpact{
    private int storageSpace;
    private String color;
    private int ram;
    private double batteryLife;

    public SmartPhone(int storageSpace, String color, int ram,double batteryLife){
        this.storageSpace = storageSpace;
        this.color = color;
        this.ram = ram;
        this.batteryLife = batteryLife;
    }
    @Override
    public double calculateWasteImpact(){
        return batteryLife * 10;
    }
    @Override
    public String toString(){
        return String.format("Smart Phone%nStorage Space:%d%nColor:%s%nRAM:%d%nBattery Life:%f%n",storageSpace,color, ram,batteryLife);
    }


}
