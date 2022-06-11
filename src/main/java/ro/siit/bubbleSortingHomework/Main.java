package ro.siit.bubbleSortingHomework;

public class Main {

    public static void main(String[] args) {

        /**
         * This code creates an array of 5 objects.
         */
        SalesRepresentatives [] salesReport = new SalesRepresentatives[5];
        salesReport[0] = new SalesRepresentatives("John Doe", 22, 450.0);
        salesReport[1] = new SalesRepresentatives("Jane Doe", 15, 722);
        salesReport[2] = new SalesRepresentatives("John Wayne", 10, 1200);
        salesReport[3] = new SalesRepresentatives("Max Stones", 12, 583);
        salesReport[4] = new SalesRepresentatives("Sarah James", 30, 498);

        /**
         * This prints out the objects in the array before the sorting method is applied.
         */
        System.out.println("Before:");
        for (SalesRepresentatives representatives : salesReport) {
            System.out.println(representatives);
        }

        /**
         * This code applies the sorting method from the BubbleSortMethod class to the array of objects.
         */
        BubbleSortMethod.sortSalesValues(salesReport);

        /**
         * This loop prints the objects in the array after the sorting method is applied.
         */
        System.out.println("After:");
        for (SalesRepresentatives salesRepresentatives : salesReport) {
            System.out.println(salesRepresentatives);
        }
    }
}
