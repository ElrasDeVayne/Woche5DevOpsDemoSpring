package ch.zhaw.iwi.devops.demo;

public class OrderProcessor {
    private String customerName;
    private String customerEmail;
    private boolean isPremiumCustomer;
    private double[] itemPrices;
    private int[] itemQuantities;
    private double totalPrice;
    private double discount;

    public void processOrder() {
        // Step 1: Validate order
        if (itemPrices == null || itemPrices.length == 0) {
            throw new IllegalArgumentException("Order is empty");
        }
        if (customerName == null || customerEmail == null) {
            throw new IllegalArgumentException("Customer information is missing");
        }

        // Step 2: Calculate total price
        totalPrice = 0;
        for (int i = 0; i < itemPrices.length; i++) {
            double itemTotal = itemPrices[i] * itemQuantities[i];
            totalPrice += itemTotal;
        }

        // Step 3: Apply discount
        discount = 0;
        if (isPremiumCustomer) {
            discount = totalPrice * 0.1;
        }

        // Step 4: Print confirmation message
        System.out.println("Dear " + customerName + ",");
        System.out.println("Thank you for your order. Your total price is $" + (totalPrice - discount) + ".");
    }

    // Constructor, getters, and setters...
}
