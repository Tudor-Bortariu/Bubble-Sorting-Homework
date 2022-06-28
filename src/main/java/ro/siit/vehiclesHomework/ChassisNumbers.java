package ro.siit.vehiclesHomework;

import java.util.ArrayList;

public class ChassisNumbers {
    ArrayList<String> chassisNumbers = new ArrayList<>();

    public void addChassisNumber(String chassisNumber){
        chassisNumbers.add(chassisNumber);
    }

    public void listContainsNumber(String chassisNumber){
        chassisNumbers.contains(chassisNumber);
    }
}
