package ro.siit.bubbleSortingHomework;

public class BubbleSortMethod {
    public static void sortSalesValues(SalesRepresentatives[] numbers) {
        boolean swap = true;

        while (swap) {

            swap = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].getSalesValue() < numbers[i + 1].getSalesValue()) {
                    swap = true;
                    SalesRepresentatives temporary = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temporary;
                }
            }
        }
    }
}
