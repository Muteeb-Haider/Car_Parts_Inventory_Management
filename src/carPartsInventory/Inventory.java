package carPartsInventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<CarPart> carParts = new ArrayList<>();

    public Inventory(List<CarPart> cars) {
        for (CarPart e : cars) {
            carParts.add(e);
        }
    }

    /**
     * Finds the most durable car part of the specified type.
     * @param type The type of car part to replace.
     * @return The car part with the highest durability of the given type.
     */
    public CarPart replace(String type) {
        CarPart maxc = carParts.get(0);
        for (CarPart e : carParts) {
            if (e.getType().equals(type)) {
                if (e.getDurability() > maxc.getDurability()) {
                    maxc = e;
                }
            }
        }
        return maxc;
    }

    /**
     * Finds the cheapest car part of the specified type.
     * @param type The type of car part to search for.
     * @return The car part with the lowest price of the given type.
     */
    public CarPart cheapestPart(String type) {
        CarPart minc = carParts.get(0);
        for (CarPart e : carParts) {
            if (e.getType().equals(type)) {
                if (e.getPrice() < minc.getPrice()) {
                    minc = e;
                }
            }
        }
        return minc;
    }

    /**
     * Counts the number of car parts of the specified type in the inventory.
     * @param type The type of car part to count.
     * @return The number of car parts of the given type.
     */
    public int count(String type) {
        int c = 0;
        for (CarPart e : carParts) {
            if (e.getType().equals(type)) {
                c++;
            }
        }
        return c;
    }

    /**
     * Calculates the total value of all car parts in the inventory.
     * @return The total price of all car parts.
     */
    public int totalValue() {
        int v = 0;
        for (CarPart e : carParts) {
            v += e.getPrice();
        }
        return v;
    }

    /**
     * Calculates the total value of all car parts of a specific type.
     * @param type The type of car part to sum up.
     * @return The total price of all car parts of the given type.
     */
    public int totalValuePart(String type) {
        int s = 0;
        for (CarPart e : carParts) {
            if (e.getType().equals(type)) {
                s += e.getPrice();
            }
        }
        return s;
    }

    /**
     * Adds a new car part to the inventory.
     * @param cp The car part to be added.
     */
    public void addpart(CarPart cp) {
        carParts.add(cp);
    }

    /**
     * Searches for a car part based on its durability and type.
     * If durability is between 1 and 100, it returns the most durable part.
     * If durability is greater than 100, it returns the cheapest part.
     * Otherwise, it returns null.
     * 
     * @param durability The durability level to compare.
     * @param type The type of car part to search for.
     * @return The found car part based on the given durability and type, or null if no match is found.
     */
    public CarPart searchPart(int durability, String type) {
        if (durability >= 1 && durability <= 100) {
            return replace(type);
        } else if (durability > 100) {
            return cheapestPart(type);
        }
        return null;
    }
}
