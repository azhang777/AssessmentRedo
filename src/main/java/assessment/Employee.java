package assessment;

public abstract class Employee extends Customer implements Discountable{
    private final double DISCOUNT = 0.10;

    public Employee(String name) {
        super(name);
    }

    public Employee(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
    public abstract void printEmployeePriceAfterDiscount(Clothing clothing);

}
