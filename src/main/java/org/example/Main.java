package org.example;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

            Product product1 = new Product(4, null, false, "blue", BigDecimal.valueOf(100.00), "Chair", BigDecimal.valueOf(120.00));
            Product product2 = new Product(null, 3, true, null, null, "Old Book", BigDecimal.valueOf(15.00));
            Product product3 = new Product(null, null, false, "gold", BigDecimal.valueOf(50.00), "Golden Mug", BigDecimal.valueOf(75.00));
            Product product4 = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", BigDecimal.valueOf(40000.00));

            ShoppingCart cart = new ShoppingCart();

            cart.addProduct(product1);
            cart.addProduct(product2);
            cart.addProduct(product3);
            cart.addProduct(product4);

            Double totalPrice = cart.getTotalPrice();

            System.out.println("The total price of the shopping cart is $" + totalPrice);
        }
    }