/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carPartsInventory;

/**
 * Represents a car part with attributes for price, durability, and type.
 */
class CarPart {
    private int price, durability;
    private String type;

    public CarPart(int price, int durability, String type) {
        this.price = price;
        this.durability = durability;
        this.type = type;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDurability() {
        return this.durability;
    }

    public String getType() {
        return this.type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the car part, including its type, price, and durability.
     * @return A formatted string representing the car part.
     */
    @Override
    public String toString() {
        return this.getType() + " Part " + "Price: " + this.getPrice() + " Durability: " + this.getDurability();
    }
}
