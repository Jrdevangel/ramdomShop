
# Shopping Cart Java Application

# Description
This Java application simulates a basic shopping cart system. It allows adding products to a cart, calculating the total price of the cart, and applying various pricing rules based on product attributes such as the number of legs, age, color, and other special conditions.

# Project Structure

Main.java: Entry point for the application. It creates a few sample products, adds them to the shopping cart, and calculates the total price.
Product.java: Represents a product with attributes such as number of legs, age, color, base price, and sell price.
ShoppingCart.java: Manages a list of products and calculates the total price based on various rules.
ShoppingCartTest.java: Unit tests for the ShoppingCart class to ensure correct price calculations for different product scenarios.

# Usage

Create Product objects with specific attributes.

Add them to a ShoppingCart.

Calculate the total price of the cart using the getTotalPrice() method.

The price is calculated based on rules depending on the product's attributes, such as:

Products with legs are priced at 4.2 times the number of legs.

Age-based pricing for stinky/non-stinky products.

Color-based pricing for items with a base price.

Special pricing for certain products like Magic: The Gathering cards.
