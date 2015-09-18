/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricebowlsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sineth
 */
public class RiceBowlSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodItem foodItem=new Rice(100, FoodType.RICE);
        ArrayList<FoodItem> list=new ArrayList<FoodItem>();
        list.add(foodItem);
    }
    
}
