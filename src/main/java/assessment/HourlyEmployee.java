package assessment;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }
    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {

    }
}
