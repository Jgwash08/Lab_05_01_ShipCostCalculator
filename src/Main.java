public class Main {

    public static void main(String[] args)
    {
        //Declarations
        double shippingCost = 0;
        double totalPrice = 0;
        double itemPrice = 175.00;

        System.out.println("Enter the price of the item:");
        System.out.println(itemPrice);

        //if else logic
        if (itemPrice >= 100.00)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * 0.02;
        }
        totalPrice = itemPrice + shippingCost;

        System.out.println("The shipping cost is: " + shippingCost);
        System.out.println("The total price is:" + totalPrice);
    }
}
