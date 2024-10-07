package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();
        MagicCard product = new MagicCard("Red Card", Color.RED, 1);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 3.5, 0.01);
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();
        MagicCard product = new MagicCard("Red Card", Color.BLUE, 1);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 5.0, 0.01);
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Gourmet product = new Gourmet("Vino el tio juanillo", 20.0, 5, false);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 100.0, 0.01);
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Gourmet product = new Gourmet("Goat cheese", 25.0, 2, true);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 50.0);
    }
    
    @Test
    void testGreenMagicCardPrice() {
        ShoppingCart cart = new ShoppingCart();
        MagicCard product = new MagicCard("The Gathering - Green Card", Color.GREEN, 1);
        cart.addProduct(product);
        assertEquals(4.4, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testBlackMagicCardPrice() { 
        ShoppingCart cart = new ShoppingCart();
        MagicCard product = new MagicCard("The Gathering - Black Card", Color.BLACK, 1);
        
        cart.addProduct(product);
        assertEquals(6.80, cart.getTotalPrice(), 0.01);
    }
        

    @Test
    public void testBrownMagicCardPrice() {
        ShoppingCart cart = new ShoppingCart();
        MagicCard brownCard = new MagicCard("The Gathering - Brown Card", Color.BROWN, 1);
        cart.addProduct(brownCard);
        assertEquals(2.00, cart.getTotalPrice(), 0.01);
    }
        
    @Test
    public void testBlackLotusPrice() {
        ShoppingCart cart = new ShoppingCart();
        MagicCard blackLotus = (MagicCard)new MagicCard("The Gathering - Black Lotus", Color.NOCOLOR, 1).setBasePrice(40000.00);
        cart.addProduct(blackLotus);
        assertEquals(40000.00, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testTerrestrialPetPrice() {
        ShoppingCart cart = new ShoppingCart();
        Pet terrestrialPet = new Pet("Terrestrial Pet", 4);
        cart.addProduct(terrestrialPet);
        assertEquals(4 * 4.2, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testFishPetBluePrice() {
        ShoppingCart cart = new ShoppingCart();
        Pet fishPet = new Pet("Fish Pet Blue", 0)
            .setPetType(PetType.AQUATIC)
            .setColor(Color.BLUE);

        cart.addProduct(fishPet);
        assertEquals(0.1, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testFishPetGoldPrice() {
        ShoppingCart cart = new ShoppingCart();
        Pet fishPet = new Pet("Fish Pet Gold", 0)
            .setPetType(PetType.AQUATIC)
            .setColor(Color.GOLD);

        cart.addProduct(fishPet);
        assertEquals(100.00, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testMagicCardRedBlue10Years() {
        ShoppingCart cart = new ShoppingCart();
        MagicCard redCard = new MagicCard("Red Card", Color.RED, 11);
        MagicCard blueCard = new MagicCard("Blue Card", Color.BLUE, 15);
        cart
            .addProduct(redCard)
            .addProduct(blueCard);
        assertEquals(4.25, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testMagicCardGreenBlack20Years() {
        ShoppingCart cart = new ShoppingCart();
        MagicCard greenCard = new MagicCard("Green Card", Color.GREEN, 21);
        MagicCard blackCard = new MagicCard("Black Card", Color.BLACK, 22);
        cart
            .addProduct(greenCard)
            .addProduct(blackCard);
        assertEquals(11.2 *1.2, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testStinkySpider() {
        ShoppingCart cart = new ShoppingCart();
        Pet stinkySpider = new Pet("Stinky Spider", 8)
            .setPricePerLeg(1.2)
            .setColor(Color.BLACK);
        cart.addProduct(stinkySpider);
        assertEquals(9.6, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testStinkySpiderRed() {
        ShoppingCart cart = new ShoppingCart();
        Pet stinkySpider = new Pet("Stinky Spider Red", 8)
            .setPricePerLeg(1.2)
            .setColor(Color.RED);
        cart.addProduct(stinkySpider);
        assertEquals(25.6, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testStinkySpiderGold() {
        ShoppingCart cart = new ShoppingCart();
        Pet stinkySpider = new Pet("Stinky Spider Gold", 8)
            .setPricePerLeg(1.2)
            .setColor(Color.GOLD);
        cart.addProduct(stinkySpider);
        assertEquals(33.6, cart.getTotalPrice(), 0.01);
    }   
}