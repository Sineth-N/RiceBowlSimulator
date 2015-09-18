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
class Plate {
    private int cost;

    public Plate(Rice rice) {
        rice.scoop();
    }
    
    void add(FoodItem aThis) {
        System.out.println(aThis.toString());
    }

    void increasePrice(int price) {
        this.cost+=price;
        System.out.println("price was increased by "+price);
    }

    
}
