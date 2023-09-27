package assessment;

import java.util.Arrays;

public abstract class Customer extends Person{

    public Customer(String name) {
        super(name);
    }

    public Customer(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    //underline means that the method is static!**
    //italicize means that the method is abstract!** not in this case
    public static void printCustomerName(Customer customer) {
        System.out.println(customer.getPersonName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "personName='" + getPersonName() + '\'' +
                ", size=" + getSize() +
                ", clothingItems=" + Arrays.toString(getClothingItems()) +
                '}';
    }
}
