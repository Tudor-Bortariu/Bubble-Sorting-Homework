package ro.siit.homework03;

public  abstract class Car implements Vehicle{
    private final String chassisNumber;
    private int tireSize;
    private final float fuelTankSize;
    private final String fuelType;
    private double availableFuel;
    private final int gears;
    private final double consumptionPer100Km;

    /**
     * This is a constructor of objects. In this case we create objects that will require 7 different
     * types of parameters to be entered in order to create an instance of the object.
     * @param chassisNumber is a String parameter which is final and its value cannot be changed.
     * @param tireSize is an int parameter whose value can be changed through a setter method.
     * @param fuelTankSize is a float parameter whose value is final and cannot be modified.
     * @param fuelType is a String parameter whose value is final and cannot be modified.
     * @param availableFuel is a double parameter whose value can be modified through a setter method.
     * @param gears is an int parameter whose value is final and cannot be changed.
     * @param consumptionPer100Km is a double parameter whose value is final and cannot be changed.
     */
    public Car(String chassisNumber, int tireSize, float fuelTankSize, String fuelType, double availableFuel, int gears, double consumptionPer100Km) {
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.availableFuel = availableFuel;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    /**
     * This is a getter method.
     * @return returns the value of the available fuel from an instance of a Car object.
     */
    public double getAvailableFuel() {
        return availableFuel;
    }

    /**
     * This is a getter method.
     * @return returns the value of the average consumption from an instance of a Car object.
     */
    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    /**
     * This is a getter method.
     * @return returns the maximum number of gears from an instance of a Car object.
     */
    public int getGears() {
        return gears;
    }

    public void start() {
        this.availableFuel = this.availableFuel - 0.05;
    }

    public void stop() {
    }

    /**
     * This overrides the drive method from the Vehicle interface. With this method we increase the average consumption
     * if the tire size is bigger than 18. We decrease the available fuel accordingly to the average consumption and
     * driven number of kilometers of the vehicle.
     * @param kilometers gives the number of kilometers the vehicle drives for.
     */
    @Override
    public void drive(double kilometers) {
        if(this.tireSize <= 18){
            this.availableFuel = this.availableFuel - ((this.getConsumptionPer100Km()/100)*kilometers);
        }else{
            this.availableFuel = this.availableFuel - (((this.getConsumptionPer100Km()+1)/100)*kilometers);
        }
    }

    /**
     * This method decreases the available fuel from the car at every gear shift.
     * @param gear gives the gear you want to shift into.
     */
    public void shiftGear(int gear) {
        if(gear <= this.getGears()){
            this.availableFuel = this.availableFuel - 0.01;
        }else{
            System.out.println("Gear not available!");
        }
    }
}

