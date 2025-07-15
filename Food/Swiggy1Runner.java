class Swiggy1Runner {
    public static void main(String swiggy[]) {
        String foodName = "meghana foods";

        double price = Swiggy1.getTakeOrder(foodName);
        System.out.println("The order price is: " + price);

        int quantity = 3;
        double priceWithQuantity = Swiggy1.search(foodName, quantity);
        System.out.println("The price of " + foodName + " with quantity " + quantity + " is " + priceWithQuantity);
    }
}

