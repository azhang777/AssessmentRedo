package assessment;

public class Student extends Customer implements Discountable {
    private long id;
    private final double DISCOUNT = 0.5;

    public Student(String name) {
        super(name);
    }

    public Student(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
