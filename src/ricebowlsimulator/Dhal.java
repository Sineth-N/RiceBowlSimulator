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
public class Dhal extends FoodItem{
    private int capacity;
   
    public Dhal(int capacity, FoodType f) {
        super(capacity, f);
        this.capacity=capacity;
    }

    @Override
    public void scoop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException();
        }else{
            this.capacity-=3;
        }
    }

    @Override
    public Plate addUp(Plate plate) {
        plate.add(this);
        plate.increasePrice(price());
        return plate;
    }

    @Override
    public int price() {
        return 10;
    }
    
}
