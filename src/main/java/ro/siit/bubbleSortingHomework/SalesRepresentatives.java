package ro.siit.bubbleSortingHomework;

public class SalesRepresentatives {
    private final String name;
    private int numberOfSales;
    private double quota;
    private double salesValue;

    public SalesRepresentatives(String name, int numberOfSales, double quota) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.salesValue = this.numberOfSales * this.quota;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.salesValue + ")";
    }

    public double getSalesValue() {
        return salesValue;
    }
}
