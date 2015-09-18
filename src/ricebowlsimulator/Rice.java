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
public class Rice extends FoodItem {

    private int capacity;
    private FoodType foodType;

    public Rice(int capacity, FoodType f) {
        super(capacity, f);
        this.capacity = capacity;
       
    }

    @Override
    public void scoop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException();
        }else{
            this.capacity-=10;
        }

    }

    @Override
    public Plate addUp(Plate plate) {
        plate.add(this);
        plate.increasePrice(price());
        return  plate;
    }

    @Override
    public int price() {
        return 30;
    }

    @Override
    public String toString() {
        return "Rice{" + "capacity=" + capacity + ", foodType=" + foodType + '}'+"was added";
    }

    
}
