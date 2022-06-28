package ro.siit.homework03;

public class Logan extends Dacia implements Vehicle{

    public Logan(String chassisNumber, int tireSize, float fuelTankSize, String fuelType, double availableFuel, int gears, double consumptionPer100Km) {
        super(chassisNumber, tireSize, fuelTankSize, fuelType, availableFuel, gears, consumptionPer100Km);
    }

    /**
     * This method decreases the available fuel from the car at every gear shift.
     * @param gear gives the gear you want to shift into.
     */
    @Override
    public void shiftGear(int gear) {
        if(gear <= this.getGears()){
            setAvailableFuel(this.availableFuel - (this.availableFuel * 0.1));
        }else{
            System.out.println("Gear not available!");
        }
    }
}
