/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricebowlsimulator;

/**
 *
 * @author Sineth
 */
public abstract class FoodItem {

    private final int MAX_CAPACITY = 100;
    private int capacity;
    private FoodType foodType;

    public FoodItem(int capacity, FoodType f) {
        this.capacity = capacity;
        this.foodType = f;
    }

    public int getCapacity() {
        return capacity;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public boolean isEmpty() {
        if (capacity > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void refill(int a) throws OverFlowException {
        if (a > MAX_CAPACITY) {
            throw new OverFlowException();
        } else {
            this.capacity = a;
        }
    }

    public abstract void scoop() throws IllegalStateException;

    public abstract Plate addUp(Plate plate);

    public abstract int price();
}
