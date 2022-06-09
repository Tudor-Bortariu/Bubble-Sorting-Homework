package ro.siit.bubbleSortingHomework;

public class Main {
    public static void main(String[] args) {

        SalesRepresentatives [] salesReport = new SalesRepresentatives[5];
        salesReport[0] = new SalesRepresentatives("John Doe", 22, 450.0);
        salesReport[1] = new SalesRepresentatives("Jane Doe", 15, 722);
        salesReport[2] = new SalesRepresentatives("John Wayne", 10, 1200);
        salesReport[3] = new SalesRepresentatives("Max Stones", 12, 583);
        salesReport[4] = new SalesRepresentatives("Sarah James", 30, 498);

        System.out.println("Before:");
        for (SalesRepresentatives representatives : salesReport) {
            System.out.println(representatives);
        }

        BubbleSortMethod.sortSalesValues(salesReport);

        System.out.println("After:");
        for (SalesRepresentatives salesRepresentatives : salesReport) {
            System.out.println(salesRepresentatives);
        }
    }
}
