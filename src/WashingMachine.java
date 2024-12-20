public class WashingMachine implements WasteImpact {
    private int capacity;
    private int rpm;


    public WashingMachine(int capacity,int rpm){
        this.capacity = capacity;
        this.rpm = rpm;
    }

    @Override
    public double calculateWasteImpact(){
        return rpm * .5;
    }
    @Override
    public String toString(){
        return String.format("Capacity:%d%nRPM:%d%n",capacity,rpm);
    }
}
