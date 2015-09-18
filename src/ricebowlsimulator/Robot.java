/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricebowlsimulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ricebowlsimulator.Rice;

/**
 *
 * @author Sineth
 */
public class Robot {

    private Plate plate;
    private FoodItem rice;
    private ArrayList<FoodItem> list;
    public Robot(FoodItem... f) {
        
        list = new ArrayList<>(Arrays.asList(f));
        
    }

    public void newOrder(ArrayList<FoodItem> f) {

       // plate = new Plate(f.get(f.indexOf(rice)));
    }

    public void orderUp(FoodItem foodItem) {
        System.out.println("Test");
    }
}
