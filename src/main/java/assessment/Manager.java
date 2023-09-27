package assessment;

public class Manager extends Employee {

    private final double MANAGER_DISCOUNT = 0.05;

    public Manager(String name) {
        super(name);
    }

    public Manager(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
        double managerDiscount = MANAGER_DISCOUNT + super.getDISCOUNT();
        double discount = clothing.getPrice() * managerDiscount;
        System.out.println(clothing.getPrice() - discount);
    }
    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
