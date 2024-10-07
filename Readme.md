# Exercise kata-ramdonShop

# Overview

This Java-based shopping cart system models various product types (e.g., Magic Cards, Gourmet items, Pets) with different pricing rules and attributes. The system is flexible, allowing for the addition of custom product types, each with distinct behavior such as age, color, number of legs, or whether they are "stinky."

# Classes

* Product (Abstract): Base class for all product types. It defines a product name and base price and requires subclasses to implement their own getPrice logic.

* ShoppingCart: Manages a collection of Product objects and calculates the total price.

* MagicCard: Represents Magic cards with attributes such as color and age, affecting the price calculation.

* Gourmet: A type of product that has an age and can be "stinky," affecting its price.

* Pet: Represents a pet, which can have color, legs, and a "stinky" status. The price depends on the number of legs and other factors like color or stinkiness.

# Interfaces

* Colorable: For products that have a color.

* Ageable: For products that have an age.

* Stinky: For products that may emit an odor, impacting their price.
* WithLegs: For products with a defined number of legs, such as pets.

# Product Categories

* Footwear: Simple product category with fixed price.

* MagicCard: Price varies based on color and age.

* Gourmet: Price is influenced by the age of the product.
* Pet: Price varies based on number of legs, type, and color.

# Tests

calculatePriceForMagicCards_red(): Tests if the total price for a red Magic Card is calculated as 3.5.

calculatePriceForMagicCards_blue(): Checks that the total price for a blue Magic Card is 5.0.

calculatePriceForWine(): Verifies that the total price for a wine (quantity 5) is calculated as 100.0.

calculatePriceForCheese(): Confirms the total price for two units of goat cheese is 50.0.

testGreenMagicCardPrice(): Ensures the total price for a green Magic Card is 4.4.

testBlackMagicCardPrice(): Tests if the total price for a black Magic Card is 6.80.

testBrownMagicCardPrice(): Validates that the price for a brown Magic Card is 2.00.

testBlackLotusPrice(): Ensures that the price for a Black Lotus Magic Card is 40,000.00.

testTerrestrialPetPrice(): Checks if a terrestrial pet (4 legs) has a total price of 16.8 (4 * 4.2).

testFishPetBluePrice(): Tests that the price for a blue aquatic fish pet is 0.1.

testFishPetGoldPrice(): Verifies that the price for a gold aquatic fish pet is 100.0.

testMagicCardRedBlue10Years(): Checks the price for a red (11 years) and blue (15 years) Magic Card, resulting in 4.25.

testMagicCardGreenBlack20Years(): Ensures the price for a green (21 years) and black (22 years) Magic Card is 13.44.

testStinkySpider(): Verifies that a black stinky spider (8 legs) has a total price of 9.6 (1.2 per leg).
testStinkySpiderRed(): Ensures the total price for a red stinky spider (8 legs) is 25.6.
testStinkySpiderGold(): Confirms that the price for a gold stinky spider (8 legs) is 33.6.
