package org.example;

import scala.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*Product product1 = new Product(4, null, false, "blue", BigDecimal.valueOf(100.00), "Chair", BigDecimal.valueOf(120.00));
        Product product2 = new Product(null, 3, true, null, null, "Old Book", BigDecimal.valueOf(15.00));
        Product product3 = new Product(null, null, false, "gold", BigDecimal.valueOf(50.00), "Golden Mug", BigDecimal.valueOf(75.00));
        Product product4 = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", BigDecimal.valueOf(40000.00));

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);*/

        ShoppingCart shoppingCart = new ShoppingCart();

        MagicCard card1 = new MagicCard("Carta Magic 1", Color.BLUE, 1);
        MagicCard card2 = new MagicCard("Carta Magic 2", Color.RED, 20);
        MagicCard blackLotus = (MagicCard)new MagicCard("Black Lotus", Color.NOCOLOR, 1).setBasePrice(40000.00);
        Gourmet wine = new Gourmet("wine", 20.00, 1, false);
        Gourmet cheese = new Gourmet("cheese", 10.00, 2, true);
        Pet spider = new Pet("Stinky spider", 8.00, 8, Color.NOCOLOR, true);

        shoppingCart
            .addProduct(card1)
            .addProduct(card2)
            .addProduct(wine)
            .addProduct(cheese)
            .addProduct(spider)
            .addProduct(blackLotus);

        Double totalPrice = shoppingCart.getTotalPrice();

        System.out.println("The total price of the shopping cart is $" + totalPrice);
    }
}